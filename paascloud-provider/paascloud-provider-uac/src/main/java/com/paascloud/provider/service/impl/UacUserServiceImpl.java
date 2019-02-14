package com.paascloud.provider.service.impl;

import com.google.common.collect.Lists;
import com.paascloud.base.dto.LoginAuthDto;
import com.paascloud.core.enums.LogTypeEnum;
import com.paascloud.core.support.BaseService;
import com.paascloud.core.utils.RequestUtil;
import com.paascloud.provider.mapper.UacActionMapper;
import com.paascloud.provider.mapper.UacUserMapper;
import com.paascloud.provider.model.domain.*;
import com.paascloud.provider.service.*;
import com.paascloud.security.core.SecurityUser;
import eu.bitwalker.useragentutils.UserAgent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.task.TaskExecutor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.concurrent.TimeUnit;


/**
 * The class Uac user service.
 *
 * @author paascloud.net@gmail.com
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UacUserServiceImpl extends BaseService<UacUser> implements UacUserService {
	@Resource
	private UacUserMapper uacUserMapper;
	@Resource
	private UacActionService uacActionService;

	@Override
	@Transactional(readOnly = true, rollbackFor = Exception.class)
	public UacUser findByLoginName(String loginName) {
		logger.info("findByLoginName - 根据用户名查询用户信息. loginName={}", loginName);

		return uacUserMapper.findByLoginName(loginName);
	}

	@Override
	@Transactional(readOnly = true, rollbackFor = Exception.class)
	public UacUser findUserInfoByUserId(Long userId) {
		return uacUserMapper.selectUserInfoByUserId(userId);
	}

	@Override
	public Collection<GrantedAuthority> loadUserAuthorities(Long userId) {

		List<UacAction> ownAuthList = uacActionService.getOwnActionListByUserId(userId);
		List<GrantedAuthority> authList = Lists.newArrayList();
		for (UacAction action : ownAuthList) {
			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(action.getUrl());
			authList.add(grantedAuthority);
		}
		return authList;
	}

	@Override
	public void handlerLoginData(OAuth2AccessToken token, final SecurityUser principal, HttpServletRequest request) {

		final UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));
		//获取客户端操作系统
		final String os = userAgent.getOperatingSystem().getName();
		//获取客户端浏览器
		final String browser = userAgent.getBrowser().getName();
		final String remoteAddr = RequestUtil.getRemoteAddr(request);
		// 根据IP获取位置信息
		final String remoteLocation = null;//opcRpcService.getLocationById(remoteAddr);
		final String requestURI = request.getRequestURI();

		UacUser uacUser = new UacUser();
		Long userId = principal.getUserId();
		uacUser.setLastLoginIp(remoteAddr);
		uacUser.setId(userId);
		uacUser.setLastLoginTime(new Date());
		uacUser.setLastLoginLocation(remoteLocation);
		LoginAuthDto loginAuthDto = new LoginAuthDto(userId, principal.getLoginName(), principal.getNickName(), principal.getGroupId(), principal.getGroupName());
		// 记录token日志
		String accessToken = token.getValue();
		String refreshToken = token.getRefreshToken().getValue();
		//uacUserTokenService.saveUserToken(accessToken, refreshToken, loginAuthDto, request);
		// 记录最后登录信息
//		taskExecutor.execute(() -> this.updateUser(uacUser));
		// 记录操作日志

		UacLog log = new UacLog();
		log.setGroupId(principal.getGroupId());
		log.setGroupName(principal.getGroupName());
		log.setIp(remoteAddr);
		log.setLocation(remoteLocation);
		log.setOs(os);
		log.setBrowser(browser);
		log.setRequestUrl(requestURI);
		log.setLogType(LogTypeEnum.LOGIN_LOG.getType());
		log.setLogName(LogTypeEnum.LOGIN_LOG.getName());

		//taskExecutor.execute(() -> uacLogService.saveLog(log, loginAuthDto));
	}
}

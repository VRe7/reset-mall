package com.paascloud.provider.service.impl;

import com.google.common.collect.Lists;
import com.paascloud.base.dto.LoginAuthDto;
import com.paascloud.core.enums.LogTypeEnum;
import com.paascloud.core.support.BaseService;
import com.paascloud.core.utils.RequestUtil;
import com.paascloud.provider.mapper.UacUserMapper;
import com.paascloud.provider.model.domain.*;
import com.paascloud.provider.service.*;
import com.paascloud.security.core.SecurityUser;
import com.sun.javafx.binding.StringFormatter;
import eu.bitwalker.useragentutils.UserAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;



@Service
@Transactional(rollbackFor = Exception.class)
public class UacUserServiceImpl extends BaseService<UacUser> implements UacUserService {
	@Autowired
	private UacUserMapper uacUserMapper;

	@Override
	@Transactional(readOnly = true, rollbackFor = Exception.class)
	public UacUser findByLoginName(String loginName) {
		logger.info(String.format(" findByLoginName - 根据用户名查询用户信息 【username = %s】",loginName));
		Example example = new Example(UacUser.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andEqualTo("username", loginName);
		UacUser user = uacUserMapper.selectByExample(example).get(0);
		return user;
	}

	@Override
	@Transactional(readOnly = true, rollbackFor = Exception.class)
	public UacUser findUserInfoByUserId(Long userId) {
		Example example = new Example(UacUser.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andEqualTo("id", userId);
		UacUser user = uacUserMapper.selectByExample(example).get(0);
		return user;
	}

	@Override
	public Collection<GrantedAuthority> loadUserAuthorities(Long userId) {

//		List<UacAction> ownAuthList = uacActionService.getOwnActionListByUserId(userId);
//		List<GrantedAuthority> authList = Lists.newArrayList();
//		for (UacAction action : ownAuthList) {
//			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(action.getUrl());
//			authList.add(grantedAuthority);
//		}
		return null;
	}
}

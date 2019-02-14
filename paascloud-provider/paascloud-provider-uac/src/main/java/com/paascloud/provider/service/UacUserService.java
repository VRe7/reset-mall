package com.paascloud.provider.service;

import com.github.pagehelper.PageInfo;
import com.paascloud.base.dto.LoginAuthDto;
import com.paascloud.core.support.IService;
import com.paascloud.provider.model.domain.UacLog;
import com.paascloud.provider.model.domain.UacUser;
import com.paascloud.provider.model.dto.user.*;
import com.paascloud.security.core.SecurityUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.common.OAuth2AccessToken;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;


public interface UacUserService extends IService<UacUser> {
	/**
	 * 根据登录名查询用户信息
	 *
	 * @param loginName the login name
	 *
	 * @return the uac user
	 */
	UacUser findByLoginName(String loginName);
	/**
	 * 根据用户ID查询用户信息.
	 *
	 * @param userId the user id
	 *
	 * @return the uac user
	 */
	UacUser findUserInfoByUserId(Long userId);

	/**
	 * 获取用户拥有的所有权限编码.
	 *
	 * @param userId the user id
	 *
	 * @return the collection
	 */
	Collection<GrantedAuthority> loadUserAuthorities(Long userId);

	/**
	 * Handler login data.
	 *
	 * @param token     the token
	 * @param principal the principal
	 * @param request   the request
	 */
	void handlerLoginData(OAuth2AccessToken token, final SecurityUser principal, final HttpServletRequest request);
}

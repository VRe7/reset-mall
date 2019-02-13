/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：UacActionService.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.paascloud.provider.service;

import com.github.pagehelper.PageInfo;
import com.paascloud.base.dto.LoginAuthDto;
import com.paascloud.provider.model.domain.UacAction;
import com.paascloud.provider.model.domain.UacMenu;
import com.paascloud.provider.model.vo.MenuVo;
import com.paascloud.core.support.IService;

import java.util.List;

/**
 * The interface Uac action service.
 *
 * @author paascloud.net @gmail.com
 */
public interface UacActionService extends IService<UacAction> {


	/**
	 * 根据用户Id查询拥有的按钮权限.
	 *
	 * @param userId the user id
	 *
	 * @return the own uac action list
	 */
	List<UacAction> getOwnActionListByUserId(Long userId);

}

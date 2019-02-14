package com.paascloud.provider.service;

import com.github.pagehelper.PageInfo;
import com.paascloud.base.dto.LoginAuthDto;
import com.paascloud.provider.model.domain.UacAction;
import com.paascloud.provider.model.domain.UacMenu;
import com.paascloud.provider.model.vo.MenuVo;
import com.paascloud.core.support.IService;

import java.util.List;


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

package com.paascloud.provider.service.impl;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.paascloud.PublicUtil;
import com.paascloud.base.constant.GlobalConstant;
import com.paascloud.base.dto.LoginAuthDto;
import com.paascloud.base.enums.ErrorCodeEnum;
import com.paascloud.core.support.BaseService;
import com.paascloud.provider.mapper.UacActionMapper;
import com.paascloud.provider.mapper.UacRoleActionMapper;
import com.paascloud.provider.model.domain.UacAction;
import com.paascloud.provider.model.domain.UacMenu;
import com.paascloud.provider.model.exceptions.UacBizException;
import com.paascloud.provider.model.vo.MenuVo;
import com.paascloud.provider.service.UacActionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.AntPathMatcher;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;


@Service
@Transactional(rollbackFor = Exception.class)
public class UacActionServiceImpl extends BaseService<UacAction> implements UacActionService {
	@Resource
	private UacActionMapper uacActionMapper;
	@Resource
	private UacRoleActionMapper uacRoleActionMapper;
	private AntPathMatcher antPathMatcher = new AntPathMatcher();

	@Override
	public List<UacAction> getOwnActionListByUserId(Long userId) {
		if (userId == null) {
			throw new UacBizException(ErrorCodeEnum.UAC10011001);
		}
		List<UacAction> uacActionList;
		if (Objects.equals(userId, GlobalConstant.Sys.SUPER_MANAGER_USER_ID)) {
			// 获取全部权限信息
			uacActionList = uacActionMapper.selectAll();
		} else {
			uacActionList = uacActionMapper.getOwnUacActionListByUserId(userId);
		}
		return uacActionList;
	}
}

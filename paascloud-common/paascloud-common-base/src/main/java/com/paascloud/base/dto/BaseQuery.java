package com.paascloud.base.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * description: 分页查询基类<br>
 * version: 1.0 <br>
 * date: 2019/2/14 10:06 <br>
 * author: vnaLc <br>
 */
@Data
public class BaseQuery implements Serializable {

	private static final long serialVersionUID = 3319698607712846427L;

	/**
	 * 当前页
	 */
	private Integer pageNum = 1;

	/**
	 * 每页条数
	 */
	private Integer pageSize = 10;

	/**
	 * 排序
	 */
	private String orderBy;
}

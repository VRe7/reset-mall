package com.paascloud.base.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * description: 通用Mapper<br>
 * version: 1.0 <br>
 * date: 2019/2/14 13:54 <br>
 * author: vnaLc <br>
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

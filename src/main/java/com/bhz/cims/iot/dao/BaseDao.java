package com.bhz.cims.iot.dao;

/**
 * Created by bruse on 17年7月6.
 */

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface BaseDao<T> extends Mapper<T>,MySqlMapper<T> {
}

package com.chaosalt.eCommerce.common.core.support;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tk.mybatis.mapper.common.Mapper;

public abstract class BaseService<T> implements IService<T> {

	/**
	 * The Mapper.
	 */
	@Autowired
	protected Mapper<T> mapper;

	@Override
	public List<T> select(T record) {
		return mapper.select(record);
	}

	@Override
	public T selectByKey(Object key) {
		return mapper.selectByPrimaryKey(key);
	}

}

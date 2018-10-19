package com.chaosalt.eCommerce.common.core.support;

import java.util.List;

public interface IService<T> {
	/**
	 * 根据传入的实体对象进行查询
	 * 
	 * @param record
	 * @return List
	 */
	List<T> select(T record);

	/**
	 * 根据传入的主键进行查询
	 * 
	 * @param key the key
	 * @return the T
	 */
	T selectByKey(Object key);

}

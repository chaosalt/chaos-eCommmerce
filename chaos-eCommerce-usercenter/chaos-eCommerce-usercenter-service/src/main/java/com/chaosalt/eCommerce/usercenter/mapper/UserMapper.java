package com.chaosalt.eCommerce.usercenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.chaosalt.eCommerce.common.core.mybatis.MybatisMapper;
import com.chaosalt.eCommerce.usercenter.model.domain.User;

public interface UserMapper extends MybatisMapper<User> {

	@Select("SELECT * from t_user where uid=#{uid}")
	List<User> GetUserByUid(String uid);
}

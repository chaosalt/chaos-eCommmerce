package com.chaosalt.eCommerce.usercenter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.chaosalt.eCommerce.common.core.mybatis.MyMapper;
import com.chaosalt.eCommerce.usercenter.model.domain.User;

@Component
public interface UserMapper extends MyMapper<User> {

	@Select("SELECT * from t_user where uid=#{uid}")
	List<User> GetUserByUid(String uid);
}

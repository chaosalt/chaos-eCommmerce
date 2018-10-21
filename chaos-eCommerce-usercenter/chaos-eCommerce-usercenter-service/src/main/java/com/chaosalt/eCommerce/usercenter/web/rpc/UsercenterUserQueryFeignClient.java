package com.chaosalt.eCommerce.usercenter.web.rpc;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RestController;

import com.chaosalt.eCommerce.common.base.vo.R;
import com.chaosalt.eCommerce.usercenter.mapper.UserMapper;
import com.chaosalt.eCommerce.usercenter.model.domain.User;
import com.chaosalt.eCommerce.usercenter.service.UsercenterUserQueryFeignApi;

@RestController
public class UsercenterUserQueryFeignClient implements UsercenterUserQueryFeignApi {

	@Resource
	private UserMapper userMapper;

	@Override
	public R<String> getUserByUid(String uid) {
		User record = new User();
		record.setUid("1");
		List<User> select = userMapper.select(record);
		return R.isOk().data(select);
	}
}

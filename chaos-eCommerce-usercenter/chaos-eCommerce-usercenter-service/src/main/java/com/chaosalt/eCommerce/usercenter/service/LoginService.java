package com.chaosalt.eCommerce.usercenter.service;

import com.chaosalt.eCommerce.usercenter.model.dto.UserLoginDto;

public interface LoginService {
	/**
	 * 用户登录
	 *
	 * @param UserLoginDto the login dto
	 */
	void login(UserLoginDto loginDto);
}

package com.chaos.eCommerce.apigateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chaos.eCommerce.common.base.vo.R;
import com.chaos.eCommerce.usercenter.model.dto.UserLoginDto;
import com.chaos.eCommerce.usercenter.service.LoginService;

@RestController
public class UserLoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/user")
	@ResponseBody
	public R getAllUser() {
		UserLoginDto loginDto = new UserLoginDto();

		loginService.login(loginDto);
		return R.isOk();
	}
}

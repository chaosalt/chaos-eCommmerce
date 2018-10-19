package com.chaosalt.eCommerce.businesscenter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chaosalt.eCommerce.common.base.vo.R;
import com.chaosalt.eCommerce.usercenter.model.dto.UserLoginDto;

@RestController
public class UserLoginController {

	@GetMapping("/user")
	@ResponseBody
	public R getAllUser() {
		UserLoginDto loginDto = new UserLoginDto();

		return R.isOk();
	}
}

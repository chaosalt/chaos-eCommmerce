package com.chaosalt.eCommerce.usercenter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.chaosalt.eCommerce.usercenter.event.UserLoginEvent;
import com.chaosalt.eCommerce.usercenter.model.dto.UserLoginDto;
import com.chaosalt.eCommerce.usercenter.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	ApplicationContext applicationContext;

	@Override
	public void login(UserLoginDto loginDto) {
		applicationContext.publishEvent(new UserLoginEvent(this, loginDto));
		return;
	}

}

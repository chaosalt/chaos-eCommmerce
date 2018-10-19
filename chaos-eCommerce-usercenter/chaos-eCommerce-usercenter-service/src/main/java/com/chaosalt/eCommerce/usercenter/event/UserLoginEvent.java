package com.chaosalt.eCommerce.usercenter.event;

import org.springframework.context.ApplicationEvent;

import com.chaosalt.eCommerce.usercenter.model.dto.UserLoginDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserLoginEvent extends ApplicationEvent {

	private static final long serialVersionUID = 7831282529451176846L;

	private UserLoginDto userLoginDto;

	public UserLoginEvent(Object source, UserLoginDto userLoginDto) {
		super(source);
		this.setUserLoginDto(userLoginDto);
		log.info("接收到用户登录事件");
	}

	public UserLoginDto getUserLoginDto() {
		return userLoginDto;
	}

	public void setUserLoginDto(UserLoginDto userLoginDto) {
		this.userLoginDto = userLoginDto;
	}

}

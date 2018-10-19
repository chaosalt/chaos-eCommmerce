package com.chaosalt.eCommerce.usercenter.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.chaosalt.eCommerce.usercenter.model.dto.UserLoginDto;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class UserEventListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof UserLoginEvent) {
			// 做处理
			UserLoginDto userLoginDto = ((UserLoginEvent) event).getUserLoginDto();
			log.info(userLoginDto.toString());
		}

	}

}

package com.chaosalt.eCommerce.businesscenter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chaosalt.eCommerce.common.base.vo.R;
import com.chaosalt.eCommerce.usercenter.model.dto.UserLoginDto;

@RestController
public class UserLoginController {
	Logger log = LoggerFactory.getLogger(getClass());
	@Autowired
	private Tracer tracer; // 默认注入的是DefaultTracer

	@GetMapping("/user")
	@ResponseBody
	public R getAllUser() {
		UserLoginDto loginDto = new UserLoginDto();
		String traceId = tracer.getCurrentSpan().traceIdString();
		log.info("this is current trace Id: " + traceId);
		log.info("this is user log");
		return R.isOk();
	}
}

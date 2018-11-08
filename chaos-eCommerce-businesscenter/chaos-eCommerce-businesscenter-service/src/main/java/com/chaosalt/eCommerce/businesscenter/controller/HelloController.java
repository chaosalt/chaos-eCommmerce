package com.chaosalt.eCommerce.businesscenter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chaosalt.eCommerce.common.base.vo.R;
import com.chaosalt.eCommerce.usercenter.service.UsercenterUserQueryFeignApi;

@RestController
public class HelloController {

	@Autowired
	UsercenterUserQueryFeignApi usercenterUserQueryFeignApi;

	Logger log = LoggerFactory.getLogger(getClass());

	@GetMapping("/hello")
	@ResponseBody
	public R<String> index() {
		log.info("this is hello log");
		R<String> uid = usercenterUserQueryFeignApi.getUserByUid("1");
		return uid;
	}
}

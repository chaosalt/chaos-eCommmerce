package com.chaosalt.eCommerce.usercenter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello2")
	public String index() {
		return "hello,this is usercenter application";
	}
}
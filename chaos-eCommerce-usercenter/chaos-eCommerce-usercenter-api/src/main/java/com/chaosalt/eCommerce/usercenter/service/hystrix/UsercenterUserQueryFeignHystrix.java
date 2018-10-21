package com.chaosalt.eCommerce.usercenter.service.hystrix;

import org.springframework.stereotype.Component;

import com.chaosalt.eCommerce.common.base.vo.R;
import com.chaosalt.eCommerce.usercenter.service.UsercenterUserQueryFeignApi;

@Component
public class UsercenterUserQueryFeignHystrix implements UsercenterUserQueryFeignApi {

	@Override
	public R<String> getUserByUid(String uid) {
		return null;
	}

}

package com.chaosalt.eCommerce.usercenter.web.rpc;

import org.springframework.web.bind.annotation.RestController;

import com.chaosalt.eCommerce.common.base.vo.R;
import com.chaosalt.eCommerce.usercenter.service.UsercenterUserQueryFeignApi;

@RestController
public class UsercenterUserQueryFeignClient implements UsercenterUserQueryFeignApi {

	@Override
	public R<String> getUserByUid(String uid) {
		String s = new String("jiangchao");
		return R.isOk().data(s);
	}
}

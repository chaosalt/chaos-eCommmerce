package com.chaosalt.eCommerce.usercenter.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chaosalt.eCommerce.common.base.vo.R;
import com.chaosalt.eCommerce.usercenter.service.hystrix.UsercenterUserQueryFeignHystrix;

/**
 * 用户信息查询接口
 * 
 * @author jiang
 *
 */
@FeignClient(value = "chaos-eCommerce-usercenter", fallback = UsercenterUserQueryFeignHystrix.class)
public interface UsercenterUserQueryFeignApi {

	/**
	 * 根据uid查询用户信息
	 * 
	 * @param uid 用户uid
	 * @return 用户对象
	 */
	@RequestMapping(value = "/users/user")
	R<String> getUserByUid(String uid);
}

package com.chaosalt.eCommerce.order.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.chaosalt.eCommerce.common.base.vo.R;

@FeignClient(value = "chaos-eCommerce-businesscenter")
public interface CartFeignApi {

	/**
	 * 获取用户购物车信息
	 * 
	 * @param uid
	 * @return
	 */
	@PostMapping(value = "/api/carts/cart")
	R GetCartVO(String uid);

	/**
	 * 更新购物车中的产品信息
	 * 
	 * @param uid
	 * @return
	 */
	@PostMapping(value = "/api/carts/update")
	R UpdateProduct(String uid, Long productId);

}

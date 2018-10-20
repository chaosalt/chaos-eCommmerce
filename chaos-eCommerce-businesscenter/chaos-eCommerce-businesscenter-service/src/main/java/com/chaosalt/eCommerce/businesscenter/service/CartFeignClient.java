package com.chaosalt.eCommerce.businesscenter.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import com.chaosalt.eCommerce.common.base.vo.R;
import com.chaosalt.eCommerce.order.service.CartFeignApi;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * 购物车服务
 * 
 * @author jiang
 *
 */
@RestController
@Api(value = "API - CartFeignClient", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CartFeignClient implements CartFeignApi {

	@Override
	@ApiOperation(value = "获取用户购物车信息")
	public R GetCartVO(String uid) {
		// TODO Auto-generated method stub
		return R.isOk();
	}

	@Override
	@ApiOperation(value = "更新用户购物车中的产品信息")
	public R UpdateProduct(String uid, Long productId) {
		// TODO Auto-generated method stub
		return R.isOk();
	}

}

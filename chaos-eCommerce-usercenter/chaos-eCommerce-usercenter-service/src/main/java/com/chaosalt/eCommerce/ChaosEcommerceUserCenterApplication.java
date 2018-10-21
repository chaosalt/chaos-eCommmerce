package com.chaosalt.eCommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.chaosalt.eCommerce.usercenter.mapper")
@PropertySources(value = { @PropertySource(value = "classpath:datasource.properties", encoding = "utf-8") })
public class ChaosEcommerceUserCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChaosEcommerceUserCenterApplication.class, args);
	}
}

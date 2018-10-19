package com.chaosalt.eCommerce.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ChaosEcommerceEurekaApplication {
	public static void main(String[] args) {
		System.out.println("starting eureka======================");
		SpringApplication.run(ChaosEcommerceEurekaApplication.class, args);
	}
}

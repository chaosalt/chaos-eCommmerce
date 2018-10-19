package com.chaosalt.eCommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class App {
	public static void main(String[] args) {
		System.out.println("starting businesscenter====================");
		SpringApplication.run(App.class, args);
	}
}

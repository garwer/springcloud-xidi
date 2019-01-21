package com.garwer.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.garwer")
public class ProductServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductServerApplication.class, args);
	}
}


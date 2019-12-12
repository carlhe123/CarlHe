package com.carl.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@EnableEurekaClient
@MapperScan(basePackages = {"com.carl.demo.mapper"})
@SpringBootApplication(scanBasePackages = {
		"com.carl.demo.controller",
		"com.carl.demo.service",
		"com.carl.demo.util",
		"com.carl.demo.config"
})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

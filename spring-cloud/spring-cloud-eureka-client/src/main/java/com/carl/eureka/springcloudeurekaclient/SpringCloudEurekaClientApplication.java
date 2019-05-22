package com.carl.eureka.springcloudeurekaclient;

import com.carl.eureka.springcloudeurekaclient.controller.UserController;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class SpringCloudEurekaClientApplication {

	public static void main(String[] args) {
//		取消打印Spring Boot Banner
//		SpringApplication app = new SpringApplication(SpringCloudEurekaClientApplication.class);
//		app.setBannerMode(Banner.Mode.OFF);
//		app.run(args);
		SpringApplication.run(SpringCloudEurekaClientApplication.class,args);
	}

//	@Bean
//	public UserController getUserController(){
//		return new UserController();
//	}
}

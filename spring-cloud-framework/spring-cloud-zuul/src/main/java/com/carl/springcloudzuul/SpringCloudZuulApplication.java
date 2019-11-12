package com.carl.springcloudzuul;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

import javax.swing.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@SpringBootApplication
//@EnableZuulServer
public class SpringCloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringCloudZuulApplication.class);
		Map<String,Object> properties = new LinkedHashMap<>();
		properties.put("server.port",0);//随机向OS要一个可用的端口
		springApplication.setDefaultProperties(properties);//设置参数
		springApplication.setBannerMode(Banner.Mode.OFF);//设置是否打印Banner
		springApplication.setWebEnvironment(false);//设置是否为web项目  true-是  false-否
		springApplication.run(args);

		//Builder模式启动SpringBoot
//		new SpringApplicationBuilder(SpringCloudZuulApplication.class)
//				.properties("server.port=0")
//				.bannerMode(Banner.Mode.OFF)
//				.web(false)//设置是否为Web项目
//				.build()
//				.run(args);
	}

}

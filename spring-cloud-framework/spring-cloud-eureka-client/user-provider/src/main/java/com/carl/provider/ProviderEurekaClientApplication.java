package com.carl.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description 服务提供方引导类
 * @Author carl.he
 * @Date 2019/5/20 20:07
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class ProviderEurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderEurekaClientApplication.class, args);
    }
}

package com.carl.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

/**
 * @Description 服务消费方引导类
 * @Author carl.he
 * @Date 2019/5/20 20:07
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class ConsumerEurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerEurekaClientApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
//    @Bean
//    @LoadBalanced
//    public RestOperations getRestTemplate(RestTemplateBuilder builder){
//        return builder.build();
//    }
}

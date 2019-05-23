package com.carl.eureka.springcloudeurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.annotation.WebEndpoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 自定义扩展Endpoint
 * @Author carl.he
 * @Date 2019/5/22 16:47
 * @Version 1.0
 **/
@WebEndpoint(id = "userController")
@RestController
public class UserController {

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/get/Name")
    @ReadOperation
    public String getName(){
        return "Carl";
    }

    @GetMapping("/get/name")
    public String getApplicationName(){
//        System.out.println(System.getProperties());
        return appName;
    }
}

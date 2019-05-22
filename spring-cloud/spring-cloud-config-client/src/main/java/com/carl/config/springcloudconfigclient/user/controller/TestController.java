package com.carl.config.springcloudconfigclient.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description Test Controller类
 * @Author carl.he
 * @Date 2019/5/20 11:28
 * @Version 1.0
 **/
@RestController
public class TestController {

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/getName")
    public String getApplicationName(){
        return applicationName;
    }
}

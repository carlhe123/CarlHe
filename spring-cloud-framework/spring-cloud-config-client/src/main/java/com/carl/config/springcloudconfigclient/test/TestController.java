package com.carl.config.springcloudconfigclient.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 测试配置中心是否连接成功
 * @Author carl.he
 * @Date 2019/5/20 14:21
 * @Version 1.0
 **/
@RestController
@RefreshScope
public class TestController {

    /**获取配置中心中单的字段*/
    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/getName")
    public String getAppName(){
        return appName;
    }
}

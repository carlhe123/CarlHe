package com.carl.config.springcloudconfigclient.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;

/**
 * @Description TODO Carl写点注释吧！
 * @Author carl.he
 * @Date 2019/5/20 16:40
 * @Version 1.0
 **/
public class MyHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.up().withDetail("MyHealthIndicator","Day Day Up");
    }
}

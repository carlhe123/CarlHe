package com.carl.config.springcloudconfigclient;

import com.carl.config.springcloudconfigclient.health.MyHealthIndicator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientApplication.class, args);
	}

	@Bean
	public MyHealthIndicator myHealthIndicator(){
		return new MyHealthIndicator();
	}

	/**
	 * @Author carl.he
	 * @Description {@link Scheduled#fixedRate() 运行间隔} {@link Scheduled#initialDelay() 初始化延迟运行}
	 * 				每5s中定时运行一次  初始化延迟3s运行
	 * @Date 2019/5/20 16:55
	 * @return
	 **/
	@Scheduled(fixedRate = 5 * 1000,initialDelay = 3 * 1000)
	public void testScheduled(){
		System.out.println("Spring 定时任务运行了");
	}
}

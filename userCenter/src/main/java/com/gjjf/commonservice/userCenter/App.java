package com.gjjf.commonservice.userCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

import com.gjjf.framework.RestAppConfig;
import com.gjjf.framework.spring.SpringContextUtil;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
public class App extends RestAppConfig {

	public static void main(String[] args) {
		
		final ApplicationContext applicationContext = 
                SpringApplication.run(App.class, args);
		
		//初始化ApplicationContext
		SpringContextUtil.setContext(applicationContext);
		
	}
	
}

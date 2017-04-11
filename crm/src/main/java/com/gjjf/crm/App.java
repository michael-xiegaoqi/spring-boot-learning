package com.gjjf.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.gjjf.framework.spring.SpringContextUtil;


@ComponentScan("com.gjjf.crm.controller,"
		+ "com.gjjf.crm.service,"
		+ "com.gjjf.crm.client")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableAutoConfiguration
public class App {
	public static void main(String[] args) {
		final ApplicationContext applicationContext = 
                SpringApplication.run(App.class, args);
		
		//初始化ApplicationContext
		SpringContextUtil.setContext(applicationContext);
	}
	
	
}
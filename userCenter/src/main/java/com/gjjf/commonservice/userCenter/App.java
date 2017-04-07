package com.gjjf.commonservice.userCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

import com.gjjf.framework.RestAppConfig;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.gjjf.commonservice.userCenter"})
public class App extends RestAppConfig {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
}

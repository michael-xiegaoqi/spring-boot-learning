package com.gjjf.commonservice.userCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.gjjf.framework.RestAppConfig;

@SpringBootApplication
@EnableDiscoveryClient
public class App extends RestAppConfig {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
}

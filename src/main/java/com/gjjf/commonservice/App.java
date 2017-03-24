package com.gjjf.commonservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gjjf.framework.RestAppConfig;

@SpringBootApplication
public class App extends RestAppConfig {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
}

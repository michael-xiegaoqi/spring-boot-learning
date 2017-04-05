package com.gjjf.spring_cloud.spring_cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient //确保该应用注册到Eureka服务器
@EnableHystrix //断路器生效
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
package com.gjjf.spring_cloud_server.spring_cloud_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication      //springBoot注解,spring在springBoot基础之上来构建项目
@EnableDiscoveryClient
@EnableCircuitBreaker
public class RibbonServiceApplication {

    //spirng boot的标准入口
    public static void main(String[] args) {
        SpringApplication.run(RibbonServiceApplication.class, args);
    }
    
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

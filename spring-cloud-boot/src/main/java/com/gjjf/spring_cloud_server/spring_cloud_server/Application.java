package com.gjjf.spring_cloud_server.spring_cloud_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication      //springBoot注解,spring在springBoot基础之上来构建项目
@EnableDiscoveryClient
public class Application {

    //spirng boot的标准入口
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

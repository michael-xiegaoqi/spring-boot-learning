package com.gjjf.spring_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer         //开启eureka服务
@SpringBootApplication      //springBoot注解,spring在springBoot基础之上来构建项目
public class Application {

    //spirng boot的标准入口
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

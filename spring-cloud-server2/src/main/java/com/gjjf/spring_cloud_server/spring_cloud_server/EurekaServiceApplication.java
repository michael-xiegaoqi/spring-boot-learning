package com.gjjf.spring_cloud_server.spring_cloud_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaServer         //开启eureka服务
@SpringBootApplication      //springBoot注解,spring在springBoot基础之上来构建项目
@EnableZuulProxy
public class EurekaServiceApplication {

    //spirng boot的标准入口
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class, args);
    }
}

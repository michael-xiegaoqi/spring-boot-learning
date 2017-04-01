package com.gjjf.spring_cloud_server.spring_cloud_server;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.gjjf.spring_cloud_server.spring_cloud_server.filfer.AccessFilter;

@EnableZuulProxy
@SpringCloudApplication
public class Application {

    //spirng boot的标准入口
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
    
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

package com.gjjf.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.gjjf.zuul.filfer.AccessFilter;
import com.gjjf.zuul.filfer.ErrorFilter;
import com.gjjf.zuul.filfer.RouteFilter;

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
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
    
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

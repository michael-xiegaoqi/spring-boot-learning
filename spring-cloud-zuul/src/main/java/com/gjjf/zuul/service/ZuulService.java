package com.gjjf.zuul.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ZuulService {
	
	private Logger logger = LoggerFactory.getLogger(ZuulService.class);
	
	@Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getServiceFallback")
    public String get() {
    	
    	logger.info("服务调用入口");
        return restTemplate.getForEntity("http://crm-service/crm/get", String.class).getBody();
    }

    public String getServiceFallback() {
        return "error";
    }


}
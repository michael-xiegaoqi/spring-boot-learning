package com.gjjf.spring_cloud.spring_cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gjjf.spring_cloud.spring_cloud.service.ProviderService;

@RestController
public class ProviderController {
    private final Logger logger = LoggerFactory.getLogger(ProviderController.class);
    
    @Autowired
    private ProviderService providerService;
    
    @Autowired
    private DiscoveryClient client;
    
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestParam String str) {
        logger.info("进入了方法 str:{}", str);
        return providerService.list();
    }
    
    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }
}
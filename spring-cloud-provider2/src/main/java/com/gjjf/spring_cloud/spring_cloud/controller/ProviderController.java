package com.gjjf.spring_cloud.spring_cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ProviderController {
    private final Logger logger = LoggerFactory.getLogger(ProviderController.class);

    @RequestMapping(value = "/provider2/test/{fallback}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod="helloFallbackMethod")/*调用方式失败后调用helloFallbackMethod*/
    public String test(@PathVariable("fallback") String fallback) {
        logger.info("provider2进入了方法 str:{}", fallback);
        if("1".equals(fallback)){
            throw new RuntimeException("...");
        }
        return "hell";
    }
    
    public String helloFallbackMethod(String fallback){
        return "fallback 参数值为:"+fallback;
    }
}
package com.gjjf.spring_cloud.spring_cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gjjf.spring_cloud.spring_cloud.client.ConsumerClient;

@RestController
public class ConsumerController {

    @Autowired
    ConsumerClient computeClient;

    @RequestMapping("/test/{fallback}")
    public String hello(@PathVariable("fallback") String fallback){
        String res=computeClient.test(fallback);
        return "调用服务结果为"+res;
    }

}
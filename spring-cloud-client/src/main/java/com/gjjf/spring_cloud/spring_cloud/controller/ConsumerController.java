package com.gjjf.spring_cloud.spring_cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gjjf.spring_cloud.spring_cloud.service.ConsumerService;

@RestController
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(String str) {
        return consumerService.test(str);
    }

}
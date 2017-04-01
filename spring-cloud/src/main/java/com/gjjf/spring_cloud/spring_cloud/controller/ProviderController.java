package com.gjjf.spring_cloud.spring_cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    private final Logger logger = LoggerFactory.getLogger(ProviderController.class);

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestParam String str) {
        logger.info("进入了方法 str:{}", str);
        return str;
    }
}
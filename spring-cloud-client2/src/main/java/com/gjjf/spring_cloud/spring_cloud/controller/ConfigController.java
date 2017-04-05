package com.gjjf.spring_cloud.spring_cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	@Value("${from}")
    private String from;

    @RequestMapping("/from")
    public String from() {

        return this.from;
    }

}
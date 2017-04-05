package com.gjjf.spring_cloud_server.spring_cloud_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

	@Autowired
	com.gjjf.spring_cloud_server.spring_cloud_server.service.ConsumerService ConsumerService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return ConsumerService.addService();
    }

}
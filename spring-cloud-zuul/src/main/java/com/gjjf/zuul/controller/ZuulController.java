package com.gjjf.zuul.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gjjf.zuul.service.ZuulService;

@RestController
public class ZuulController {
	
	private Logger logger = LoggerFactory.getLogger(ZuulController.class);
	
	@Autowired
	ZuulService zuulService;

	@RequestMapping(value = "/api/crm/get", method = RequestMethod.GET)
    public String get() {
		
		logger.info("路由的入口");
		
        return zuulService.get();
    }

}
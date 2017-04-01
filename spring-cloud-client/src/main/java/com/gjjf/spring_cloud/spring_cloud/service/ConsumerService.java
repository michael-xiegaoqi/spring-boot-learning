package com.gjjf.spring_cloud.spring_cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gjjf.spring_cloud.spring_cloud.client.ConsumerClient;

@Service
public class ConsumerService {
	
	@Autowired
    ConsumerClient computeClient;
	
    public String test(String str) {
    	System.out.println("*************业务方法实现*****************");
    	return computeClient.test(str);
    }

}
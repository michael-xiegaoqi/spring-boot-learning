package com.gjjf.spring_cloud.spring_cloud.client;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ComputeClientHystrix implements ConsumerClient{
	
    public String test(@RequestParam("str") String str) {
    	return "你错了";
    }

}
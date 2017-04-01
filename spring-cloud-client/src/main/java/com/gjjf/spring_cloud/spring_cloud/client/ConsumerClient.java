package com.gjjf.spring_cloud.spring_cloud.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-provider", fallback = ComputeClientHystrix.class)
public interface ConsumerClient {

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String test(@RequestParam("str") String str);

}
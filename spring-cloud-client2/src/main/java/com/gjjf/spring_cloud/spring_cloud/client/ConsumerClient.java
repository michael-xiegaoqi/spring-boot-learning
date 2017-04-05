package com.gjjf.spring_cloud.spring_cloud.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service-provider2")
public interface ConsumerClient {

    @RequestMapping(method = RequestMethod.GET, value = "/provider2/test/{fallback}")
    String test(@PathVariable("fallback") String fallback);

}
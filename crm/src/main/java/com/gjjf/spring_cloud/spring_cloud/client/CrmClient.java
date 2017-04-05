package com.gjjf.spring_cloud.spring_cloud.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gjjf.framework.rest.Result;

@FeignClient(value = "userCenter", fallback = ComputeClientHystrix.class)
public interface CrmClient {

    @RequestMapping(method = RequestMethod.GET, value = "/user/get")
    public Result get(@RequestParam("id") Long id);

}
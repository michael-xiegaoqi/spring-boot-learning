package com.gjjf.spring_cloud.spring_cloud.client;

import org.springframework.stereotype.Component;

import com.gjjf.framework.rest.Result;

@Component
public class ComputeClientHystrix implements CrmClient{

	@Override
	public Result get(Long id) {
		return new Result();
	}

}
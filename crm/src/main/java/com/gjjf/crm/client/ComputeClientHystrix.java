package com.gjjf.crm.client;

import org.springframework.stereotype.Component;

import com.gjjf.framework.rest.Result;

@Component
public class ComputeClientHystrix implements CrmClient{

	public Result get(Long id) {
		Result result = new Result();
		result.setMessage("用户中心服务调用失败");
		return result;
	}

}
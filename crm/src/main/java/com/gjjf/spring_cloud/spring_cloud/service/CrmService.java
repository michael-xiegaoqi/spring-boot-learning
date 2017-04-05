package com.gjjf.spring_cloud.spring_cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gjjf.framework.rest.Result;
import com.gjjf.spring_cloud.spring_cloud.client.CrmClient;

@Service
public class CrmService {
	
	@Autowired
    CrmClient crmClient;
	
	public Result get(Long id) {
		return crmClient.get(id);
	}

}
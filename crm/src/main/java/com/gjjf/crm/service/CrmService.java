package com.gjjf.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gjjf.crm.client.CrmClient;
import com.gjjf.framework.rest.Result;

@Service
public class CrmService {
	
	@Autowired
    CrmClient crmClient;
	
	public Result get(Long id) {
		return crmClient.get(id);
	}

}
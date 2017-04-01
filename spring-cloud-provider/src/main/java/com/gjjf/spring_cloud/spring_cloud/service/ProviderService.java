package com.gjjf.spring_cloud.spring_cloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

@Service
public class ProviderService {
	
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	public String list() {
		
		List<String> listService= discoveryClient.getServices();
		
		if(listService == null || listService.size() > 1) {
			System.out.println("###############注册中心信息为空");
			return "注册中心信息为空";
		}
		StringBuffer strBuffer = new StringBuffer();
		for(String str : listService) {
			strBuffer.append(str).append(",");
		}
		return strBuffer.toString();
	}
	

}
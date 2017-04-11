package com.gjjf.crm.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.gjjf.crm.vo.QueryRiskDataVO;
import com.gjjf.crm.vo.RequestDataVO;
import com.gjjf.framework.util.HttpUtils;
import com.gjjf.framework.util.JSONUtils;

@Service
public class DataService {
	
	private Logger logger = LoggerFactory.getLogger(DataService.class);
	
	public final static String url = "http://192.168.1.43:8989/pcac_front/queryRiskInfo";
	
	public void get() {
		
		QueryRiskDataVO queryRiskDataVO = new QueryRiskDataVO();
		
		queryRiskDataVO.setAction("query");
		queryRiskDataVO.setIdNo("372923199404063834");
		queryRiskDataVO.setIdType("03");
		queryRiskDataVO.setName("张三");
		queryRiskDataVO.setPeriod(1);
		
		RequestDataVO requestDataVO = new RequestDataVO();
		
		requestDataVO.setMemberNo("A0000051");
		requestDataVO.setVersion("1.0");
		requestDataVO.setData(queryRiskDataVO);
		
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("requestData", JSONUtils.toJsonString(requestDataVO));
		
		try {
			String result = HttpUtils.sendPostByForm(url, map);
			logger.info("返回数据信息 result:{}",result);
		} catch (ParseException e) {
			logger.error("类型转换异常：",e);
		} catch (IOException e) {
			logger.error("IO 异常：",e);
		}
		
	}

}
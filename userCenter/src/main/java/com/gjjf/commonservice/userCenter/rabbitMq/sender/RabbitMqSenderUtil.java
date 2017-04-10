package com.gjjf.commonservice.userCenter.rabbitMq.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 消息发送工具类
 * @author henser
 *
 */
@Component
public class RabbitMqSenderUtil {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
    public void send() {
    	logger.info("henser 发送消息...");
    }
	
}
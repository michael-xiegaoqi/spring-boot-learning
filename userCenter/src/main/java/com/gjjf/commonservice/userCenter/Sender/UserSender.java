package com.gjjf.commonservice.userCenter.Sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息发送
 * @author henser
 *
 */
@Component
public class UserSender {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
    private AmqpTemplate rabbitTemplate;
	
    public void send() {
    	logger.info("henser 发送消息...");
        rabbitTemplate.convertAndSend("userCenter", "你好，henser");
    }
	
}
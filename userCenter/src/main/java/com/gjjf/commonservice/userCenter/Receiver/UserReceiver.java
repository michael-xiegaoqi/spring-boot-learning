package com.gjjf.commonservice.userCenter.Receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息接收
 * @author henser
 *
 */
@Component
@RabbitListener(queues = "userCenter")
public class UserReceiver {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RabbitHandler
    public void receiveMessage(String message) {
    	logger.info("接收的消息信息：{}",message);
    }
	
}
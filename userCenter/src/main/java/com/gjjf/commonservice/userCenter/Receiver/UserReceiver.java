package com.gjjf.commonservice.userCenter.Receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 消息接收
 * @author henser
 *
 */
@Service
public class UserReceiver {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
    private AmqpTemplate rabbitTemplate;
	
    @RabbitListener(queues = "userCenter")
    public void receiveMessage(String message) {
    	logger.info("接收的消息信息：{}",message);
    }
	
}
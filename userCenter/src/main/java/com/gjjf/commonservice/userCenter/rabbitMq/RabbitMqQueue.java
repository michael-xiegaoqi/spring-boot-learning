package com.gjjf.commonservice.userCenter.rabbitMq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置消息队列
 * @author henser
 *
 */
@Configuration
@ConfigurationProperties(prefix = RabbitMqQueue.PREFIX, ignoreUnknownFields = false)
public class RabbitMqQueue {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	//对应配置文件里的配置键
    public final static String PREFIX = "rabbitmq"; 
	
	@Value("${spring.rabbitmq.userCenter.queue}")
	private String userCenter_queue;
	
	@Bean
	public Queue userCenterQueue() {
		
		logger.info("会员中心消息队列的名称:{}",userCenter_queue);
		
		return new Queue(userCenter_queue);
	}
	
	@Bean
	public Queue userInfoQueue() {
		
		logger.info("会员信息消息队列的名称:{}","userInfo");
		
		return new Queue("userInfo");
	}
	
}
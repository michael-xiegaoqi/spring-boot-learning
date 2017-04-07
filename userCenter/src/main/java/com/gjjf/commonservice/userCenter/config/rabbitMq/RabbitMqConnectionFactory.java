package com.gjjf.commonservice.userCenter.config.rabbitMq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 创建消息消费者或生产者 ConnectionFactory
 * @author henser
 *
 */
@Configuration
public class RabbitMqConnectionFactory {
	
//	private Logger logger = LoggerFactory.getLogger(getClass());
//	
//	@Autowired
//    private RabbitMqConfig rabbitMqConfig;
//	
//	@Bean  
//    public ConnectionFactory connectionFactory() {  
//        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();  
//        connectionFactory.setAddresses(rabbitMqConfig.getHost()+":"+rabbitMqConfig.getPort());  
//        connectionFactory.setUsername(rabbitMqConfig.getUsername());  
//        connectionFactory.setPassword(rabbitMqConfig.getPassword());  
//        connectionFactory.setVirtualHost("/");  
//        connectionFactory.setPublisherConfirms(true); //必须要设置  
//        return connectionFactory;  
//    }  
//	
//	@Bean  
//	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  
//	//必须是prototype类型  
//	public RabbitTemplate rabbitTemplate() {  
//	    RabbitTemplate template = new RabbitTemplate(connectionFactory());  
//	    return template;  
//	} 
	
}
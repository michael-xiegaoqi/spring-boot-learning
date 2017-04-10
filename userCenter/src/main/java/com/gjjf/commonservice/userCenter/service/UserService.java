package com.gjjf.commonservice.userCenter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gjjf.commonservice.userCenter.dao.autocode.UserMapper;
import com.gjjf.commonservice.userCenter.dao.custom.UserDao;
import com.gjjf.commonservice.userCenter.model.User;
import com.gjjf.commonservice.userCenter.redis.UserRedisDao;
import com.gjjf.userCenter.common.vo.user.UserVO;

@Service
@Transactional
public class UserService {
	
	private Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserRedisDao userRedisDao;
	
	@Autowired
	private UserDao userDao;
	
	@Value("${from}")
	private String from;
	
	public void insert(UserVO vo){
		
		
	}
	
	public User get(Long id) {
		
		User user = userRedisDao.getUser(id);
		
		if(logger.isInfoEnabled()) {
			logger.info("缓存中获取的会员数据为:{}",user);
		}
		
		if(user != null) {
			return user;
		}
		
		user = userMapper.getUserById(id);
		
		userRedisDao.saveUser(user);
		
		return user;
		
	}
	
	public UserVO getUserVO(Integer user_id) {
		
		return userDao.getMemberInfo(user_id);
		
	}
	
	public String testBus() {
		
		String str = "测试 消息总线的属性修改值:" + from;
		
		return str;
	}

}
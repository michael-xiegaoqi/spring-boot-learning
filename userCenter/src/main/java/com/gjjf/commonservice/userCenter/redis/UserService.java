package com.gjjf.commonservice.userCenter.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gjjf.commonservice.userCenter.dao.autocode.UserMapper;
import com.gjjf.commonservice.userCenter.model.User;
import com.gjjf.userCenter.common.vo.user.UserVO;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public void insert(UserVO vo){
		
		
	}
	
	public User get(Long id) {
		
		return userMapper.getUserById(id);
		
	}
	

}
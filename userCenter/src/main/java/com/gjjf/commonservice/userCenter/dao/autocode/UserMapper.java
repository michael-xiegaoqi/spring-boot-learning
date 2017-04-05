package com.gjjf.commonservice.userCenter.dao.autocode;

import org.apache.ibatis.annotations.Mapper;

import com.gjjf.commonservice.userCenter.model.User;

@Mapper
public interface UserMapper {

	public User getUserById(Long id);
	
}

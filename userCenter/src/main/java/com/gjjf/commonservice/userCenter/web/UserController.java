package com.gjjf.commonservice.userCenter.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gjjf.commonservice.userCenter.service.UserService;
import com.gjjf.framework.rest.Result;
import com.gjjf.userCenter.common.vo.user.UserVO;

@RestController
public class UserController {
	
    private final Logger logger = LoggerFactory.getLogger(UserController.class);
    
    @Autowired
    private UserService userService;
    
    
    @RequestMapping(value = "/user/insert", method = RequestMethod.POST)
    public Result insert(UserVO vo) {
        
    	Result result = new Result();
    	
    	userService.insert(vo);
    	
    	return result;
    	
    }
    
}
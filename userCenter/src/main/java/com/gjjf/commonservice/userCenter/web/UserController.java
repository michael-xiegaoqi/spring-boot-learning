package com.gjjf.commonservice.userCenter.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gjjf.commonservice.userCenter.Sender.UserSender;
import com.gjjf.commonservice.userCenter.model.User;
import com.gjjf.commonservice.userCenter.service.UserService;
import com.gjjf.framework.rest.Result;
import com.gjjf.framework.rest.ResultCode;
import com.gjjf.userCenter.common.vo.user.UserVO;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private UserSender userSender;
    
    @RequestMapping(value = "/user/insert", method = RequestMethod.POST)
    public Result insert(UserVO vo) {
        
    	Result result = new Result();
    	
    	userService.insert(vo);
    	
    	return result;
    	
    }
    
    @RequestMapping(value = "/user/get", method = RequestMethod.GET)
    public Result get(Long id) {
        
    	Result result = new Result();
    	
    	User user = userService.get(id);
    	
    	result.setCode(ResultCode.SUCCESS);
    	result.setMessage("获取成功");
    	result.setObject(user);
    	
    	return result;
    	
    }
    
    @RequestMapping(value = "/user/send", method = RequestMethod.GET)
    public Result send(UserVO vo) {
        
    	Result result = new Result();
    	
    	userSender.send();
    	
    	result.setMessage("消息发送成功");
    	
    	return result;
    	
    }
    
}
package com.gjjf.commonservice.userCenter.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gjjf.commonservice.userCenter.Sender.UserSender;
import com.gjjf.commonservice.userCenter.model.User;
import com.gjjf.commonservice.userCenter.service.UserService;
import com.gjjf.framework.rest.Result;
import com.gjjf.framework.rest.ResultCode;
import com.gjjf.framework.util.IntUtil;
import com.gjjf.userCenter.common.vo.user.UserVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("用户中心相关api")
public class UserController {
    
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	
    @Autowired
    private UserService userService;
    
    @Autowired
    private UserSender userSender;
    
    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParam(name = "vo", value = "用户详细实体user", required = true, dataType = "UserVO")
    @RequestMapping(value = "/user/insert", method = RequestMethod.POST)
    public Result insert(UserVO vo) {
        
    	Result result = new Result();
    	
    	userService.insert(vo);
    	
    	return result;
    	
    }
    
    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value = "/user/get", method = RequestMethod.GET)
    public Result get(Long id) {
        
    	Result result = new Result();
    	
    	logger.info("传入参数ID ：{}",id);
    	
    	if(IntUtil.isZero(id)){
    		result.setMessage("传入参数ID为空");
    		return result;
    	}
    	
    	User user = userService.get(id);
    	
    	result.setCode(ResultCode.SUCCESS);
    	result.setMessage("获取成功");
    	result.setObject(user);
    	
    	return result;
    	
    }
    
    @RequestMapping(value = "/user/getUserVO", method = RequestMethod.GET)
    public UserVO getUserVO(Integer user_id) {
    	
    	UserVO user = userService.getUserVO(user_id);
    	
    	return user;
    	
    }
    
    @ApiOperation(value="消息发送", notes="消息发送测试方法")
    @RequestMapping(value = "/user/send", method = RequestMethod.GET)
    public Result send(UserVO vo) {
        
    	Result result = new Result();
    	
    	userSender.send();
    	
    	result.setMessage("消息发送成功");
    	
    	return result;
    	
    }
    
}
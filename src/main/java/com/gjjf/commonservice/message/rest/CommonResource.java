package com.gjjf.commonservice.message.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gjjf.commonservice.message.biz.impl.CommonServiceImpl;

@RestController
@RequestMapping({"/message"})
public class CommonResource {

	@Autowired
	private CommonServiceImpl commonServiceImpl;

	@RequestMapping(value = { "/validcode" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	@ResponseBody
	public void getValidCode(HttpServletRequest request, HttpServletResponse response) {
		this.commonServiceImpl.getValidCode(request, response);
	}

}

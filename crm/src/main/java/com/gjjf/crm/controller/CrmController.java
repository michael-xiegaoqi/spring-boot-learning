package com.gjjf.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gjjf.crm.service.CrmService;
import com.gjjf.crm.service.DataService;
import com.gjjf.framework.rest.Result;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
public class CrmController {

    @Autowired
    CrmService crmService;
    
    @Autowired
    DataService dataService;
    
    @ApiOperation(value="CRM获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Result get(Long id) {
        return crmService.get(id);
    }
    
    @ApiOperation(value="小微平台查询凭证接口", notes="小微平台查询凭证接口")
    @RequestMapping(value = "/getData", method = RequestMethod.GET)
    public void getData() {
        dataService.get();
    }

}
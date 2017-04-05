package com.gjjf.spring_cloud.spring_cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gjjf.framework.rest.Result;
import com.gjjf.spring_cloud.spring_cloud.service.CrmService;

@RestController
public class CrmController {

    @Autowired
    CrmService crmService;

    @RequestMapping(value = "/crm/get", method = RequestMethod.GET)
    public Result get(Long id) {
        return crmService.get(id);
    }

}
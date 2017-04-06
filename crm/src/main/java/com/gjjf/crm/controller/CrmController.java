package com.gjjf.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gjjf.crm.service.CrmService;
import com.gjjf.framework.rest.Result;

@RestController
public class CrmController {

    @Autowired
    CrmService crmService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Result get(Long id) {
        return crmService.get(id);
    }

}
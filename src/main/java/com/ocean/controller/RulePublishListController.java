package com.ocean.controller;

import com.ocean.service.IRulePublishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = {"/publish"})
public class RulePublishListController {

    @Autowired
    private IRulePublishListService rulePublishListService;

    @RequestMapping(value = {"/findAllRulePubList"},produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    public List getAllUsers(){
        List list =  rulePublishListService.findAllRulePubList();
        return list;
    }
}
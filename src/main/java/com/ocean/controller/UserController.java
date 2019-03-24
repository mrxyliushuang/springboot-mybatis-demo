package com.ocean.controller;

import com.ocean.pojo.TUser;
import com.ocean.service.IUserService;
import com.ocean.utils.Json;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = {"/commn"})
public class UserController {
//
//    @Autowired
//    private IUserService userService;
//
//    @RequestMapping(value = {"/findAll"},produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
//    public List getAllUsers(){
//       List list =  userService.findAllUser();
//       return list;
//    }

    @RequestMapping(value = "/getMyInfo", method = RequestMethod.GET)
    public Json getMyInfo() {
        TUser tUser = (TUser) SecurityUtils.getSubject().getPrincipal();
        System.out.println("username:" + tUser.toString());
        return Json.succ("current user info", tUser);
    }
}

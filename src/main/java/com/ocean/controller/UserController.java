package com.ocean.controller;

import com.ocean.pojo.TUser;
import com.ocean.service.ITUserService;
import com.ocean.service.IUserService;
import com.ocean.utils.Json;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    @Autowired
    private ITUserService userService;

    @RequestMapping(value = "/getMyInfo", method = RequestMethod.GET)
    public Json getMyInfo() {
        TUser tUser = (TUser) SecurityUtils.getSubject().getPrincipal();
        System.out.println("username:" + tUser.toString());
        return Json.succ("current user info", tUser);
    }

    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    public Json userList(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("---------- 我发布的所有抢单 ----------");

        String oper = "userList";
        List userList = userService.userList();

        return Json.succ(oper).data("rows", userList);
    }
}

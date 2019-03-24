package com.ocean.controller.permmit;

import com.ocean.pojo.TUser;
import com.ocean.shiro.UserRealm;
import com.ocean.utils.Json;
import com.ocean.utils.ResultMap;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private final ResultMap resultMap;

    @Autowired
    private UserRealm userRealm;

    public AdminController(ResultMap resultMap) {
        this.resultMap = resultMap;
    }

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public ResultMap getMessage() {
        return resultMap.success().message("您拥有管理员权限，可以获得该接口的信息！");
    }

    @RequestMapping(value = "/getMyInfo", method = RequestMethod.GET)
    public Json getMyInfo() {
        TUser tUser = (TUser) SecurityUtils.getSubject().getPrincipal();
        System.out.println("username:" + tUser.toString());
        return Json.succ("current user info", tUser);
    }
}
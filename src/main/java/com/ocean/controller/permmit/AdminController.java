package com.ocean.controller.permmit;

import com.ocean.utils.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private final ResultMap resultMap;

    public AdminController(ResultMap resultMap) {
        this.resultMap = resultMap;
    }

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public ResultMap getMessage() {
        return resultMap.success().message("您拥有管理员权限，可以获得该接口的信息！");
    }
}
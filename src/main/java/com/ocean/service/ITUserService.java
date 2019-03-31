package com.ocean.service;

import com.ocean.pojo.TUser;

import java.util.List;

public interface ITUserService {

   // String getRole(String userId);
    public TUser selectByUserId(String userId);

    //用户列表
    List userList();
}

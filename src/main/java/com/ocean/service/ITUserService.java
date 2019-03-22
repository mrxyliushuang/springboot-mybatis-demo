package com.ocean.service;

import com.ocean.pojo.TUser;

public interface ITUserService {

   // String getRole(String userId);
    public TUser selectByUserId(String userId);
}

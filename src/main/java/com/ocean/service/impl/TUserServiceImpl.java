package com.ocean.service.impl;

import com.ocean.dao.TUserMapper;
import com.ocean.pojo.TUser;
import com.ocean.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;


public class TUserServiceImpl  implements ITUserService {

    @Autowired
    private TUserMapper tUserMapper;//这里可能会报错，但是并不会影响

    @Override
    public TUser selectByUserId(String userId) {
        return tUserMapper.selectByUserId(userId);
    }
}

package com.ocean.service.impl;

import com.ocean.dao.SnatchInfoMapper;
import com.ocean.dao.TUserMapper;
import com.ocean.pojo.SnatchInfo;
import com.ocean.pojo.TUser;
import com.ocean.service.IInsertSnatInfoService;
import com.ocean.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "insertSnatInfoService")
public class InsertSnatInfoServiceImpl implements IInsertSnatInfoService {

    @Autowired
    private SnatchInfoMapper snatchInfoMapper;//这里可能会报错，但是并不会影响

    //插入抢单数据
    @Override
    public boolean  insertSnatInfo(SnatchInfo snatchInfo) {

       return  snatchInfoMapper.insertSnatInfo(snatchInfo);
    }

}

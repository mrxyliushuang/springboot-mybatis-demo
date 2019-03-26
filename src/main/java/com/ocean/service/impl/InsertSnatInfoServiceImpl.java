package com.ocean.service.impl;

import com.ocean.dao.SnatchInfoMapper;
import com.ocean.dao.TUserMapper;
import com.ocean.pojo.SnatchInfo;
import com.ocean.pojo.TUser;
import com.ocean.service.IInsertSnatInfoService;
import com.ocean.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "insertSnatInfoService")
public class InsertSnatInfoServiceImpl implements IInsertSnatInfoService {

    @Autowired
    private SnatchInfoMapper snatchInfoMapper;//这里可能会报错，但是并不会影响

    //插入抢单数据
    @Override
    public boolean  insertSnatInfo(SnatchInfo snatchInfo) {

       return  snatchInfoMapper.insertSnatInfo(snatchInfo);
    }
    //我的抢单列表
    @Override
    public List mySnatchList(String snatchUserId) {
        return snatchInfoMapper.mySnatchList(snatchUserId);
    }
    //我的单个抢单详情
    @Override
    public SnatchInfo mySnatchDetail(String snatchMobileNumber) {
        return snatchInfoMapper.mySnatchDetail(snatchMobileNumber);
    }

}

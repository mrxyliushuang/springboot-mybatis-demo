package com.ocean.dao;

import com.ocean.pojo.RulePublish;
import com.ocean.pojo.SnatchInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface SnatchInfoMapper {

    int deleteByPrimaryKey(Long snatchInfoId);
    int insert(SnatchInfo record);
    int insertSelective(SnatchInfo record);
    SnatchInfo selectByPrimaryKey(Long snatchInfoId);
    int updateByPrimaryKeySelective(SnatchInfo record);
    int updateByPrimaryKey(SnatchInfo record);

    /*插入抢单信息*/
    boolean insertSnatInfo(SnatchInfo snatchInfo);

    //单个发布抢单信息列表
    List myOnePublishListById(@Param("rulePublishId") long rulePublishId);

    //单个发布抢单当日信息列表
    List myOnePublishDayList(@Param("rulePublishId") long rulePublishId);
}
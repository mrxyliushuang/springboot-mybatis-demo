package com.ocean.dao;

import com.ocean.pojo.RulePublish;
import com.ocean.pojo.SnatchInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
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

    //我的抢单
    List mySnatchList(@Param("snatchUserId") String snatchUserId);

    //我的单个抢单详情
    SnatchInfo mySnatchDetail(@Param("snatchMobileNumber")String snatchMobileNumber);

    //抢单头条
    SnatchInfo snatchLatest();

    //我的抢单搜索
    List mySnatchSearch(@Param("snatchUserId") String snatchUserId,@Param("ruleTitle") String ruleTitle);

    //单用户审核
    public  boolean updateByUser(@Param("isAudit") byte isAudit, @Param("auditDatetime") Date auditDatetime, @Param("snatchMobileNumber") String snatchMobileNumber);

    //我发布的所有抢单
    List myPublishAllSnatch(@Param("publishUserId")String publishUserId);


    //前一天抢单的号码列表
    List snatchMobile();
}
package com.ocean.dao;

import com.ocean.pojo.RulePublish;
import com.ocean.pojo.RulePublishDatetime;

public interface RulePublishDatetimeMapper {

    int deleteByPrimaryKey(Long id);


    int insert(RulePublishDatetime record);


    int insertSelective(RulePublishDatetime record);


    RulePublishDatetime selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(RulePublishDatetime record);

    int updateByPrimaryKey(RulePublishDatetime record);
    /*插入发布信息*/
    int insertPublishDate(RulePublishDatetime rulePublishDatetime);

}
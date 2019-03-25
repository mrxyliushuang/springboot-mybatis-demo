package com.ocean.service;

import com.ocean.pojo.RulePublish;

import java.util.List;

public interface IRulePublishListService {
    List findAllRulePubList();
    //抢单发布
    public boolean insertPublist(RulePublish rulePublish);
    //抢单详情
    public List queryPublishList(RulePublish rulePublish);

    //单个发布详情请求
     RulePublish selectPublishById(long rulePublishId);

    //我的发布
    List myPublishById(String publishUserId);
}

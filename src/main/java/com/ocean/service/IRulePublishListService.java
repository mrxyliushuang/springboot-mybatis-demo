package com.ocean.service;

import com.ocean.pojo.RulePublish;

import java.util.List;

public interface IRulePublishListService {
    List findAllRulePubList();
    public int insertPublist(RulePublish rulePublish);
}

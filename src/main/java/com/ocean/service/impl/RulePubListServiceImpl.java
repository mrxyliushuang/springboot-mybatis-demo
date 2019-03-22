package com.ocean.service.impl;

import com.ocean.dao.RulePublishMapper;
import com.ocean.service.IRulePublishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "rulePublishListService")
public class RulePubListServiceImpl implements IRulePublishListService {

    @Autowired
    private RulePublishMapper rulePublishDao;//这里可能会报错，但是并不会影响

    @Override
    public List findAllRulePubList() {
        return rulePublishDao.findAllRulePubList();
    }
}


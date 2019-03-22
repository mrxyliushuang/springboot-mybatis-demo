package com.ocean.service.impl;

import com.ocean.dao.RulePublishDatetimeMapper;
import com.ocean.dao.RulePublishMapper;
import com.ocean.pojo.RulePublish;
import com.ocean.pojo.RulePublishDatetime;
import com.ocean.service.IRulePublishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "rulePublishListService")
public class RulePubListServiceImpl implements IRulePublishListService {

    @Autowired
    private RulePublishMapper rulePublishDao;//这里可能会报错，但是并不会影响
    @Autowired
    private RulePublishDatetimeMapper rulePublishDatetimeMapper;
    @Override
    public List findAllRulePubList() {
        return rulePublishDao.findAllRulePubList();
    }
    /*
    * 插入发布信息
    * */
    @Override
    @Transactional
    public int insertPublist(RulePublish rulePublish) {
            rulePublishDao.insertPublist(rulePublish);
            RulePublishDatetime rulePublishDatetime = new RulePublishDatetime();
            rulePublishDatetime.setRuleDatetimeId(rulePublish.getRuleDatetimeId());
            rulePublishDatetime.setRuleDatetimeStart(rulePublish.getRuleDatetimeStart());
            rulePublishDatetime.setRuleDatetimeEnd(rulePublish.getRuleDatetimeEnd());
            rulePublishDatetime.setRuleMoney(rulePublish.getRuleMoney());
            rulePublishDatetime.setOrderNum(rulePublish.getOrderNum());
            rulePublishDatetime.setRuleNum(rulePublish.getRuleNum());
            int i = rulePublishDatetimeMapper.insertPublishDate(rulePublishDatetime);

            return i;

    }
}


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
    public boolean insertPublist(RulePublish rulePublish) {
        rulePublishDao.insertPublist(rulePublish);
        RulePublishDatetime rulePublishDatetime = new RulePublishDatetime();
        rulePublishDatetime.setRuleDatetimeId(rulePublish.getRuleDatetimeId());
        rulePublishDatetime.setRuleDatetimeStart(rulePublish.getRulePublishDatetime().getRuleDatetimeStart());
        rulePublishDatetime.setRuleDatetimeEnd(rulePublish.getRulePublishDatetime().getRuleDatetimeEnd());
        rulePublishDatetime.setRuleMoney(rulePublish.getRulePublishDatetime().getRuleMoney());
        rulePublishDatetime.setOrderNum(rulePublish.getRulePublishDatetime().getOrderNum());
        rulePublishDatetime.setRuleNum(rulePublish.getRulePublishDatetime().getRuleNum());
        boolean insertPublishDate = rulePublishDatetimeMapper.insertPublishDate(rulePublishDatetime);

        return insertPublishDate;

    }


    @Override
    public List queryPublishList(RulePublish rulePublish) {
        return rulePublishDao.queryPublishList(rulePublish);
    }

    @Override
    public RulePublish selectPublishById(long rulePublishId) {
        return rulePublishDao.selectPublishById(rulePublishId);
    }

    //我的发布
    @Override
    public List myPublishById(String publishUserId) {
        return rulePublishDao.myPublishById(publishUserId);
    }


}


package com.ocean.controller;

import com.ocean.pojo.RulePublish;
import com.ocean.service.IRulePublishListService;
import com.ocean.service.impl.RulePubListServiceImpl;
import com.ocean.utils.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(value = {"/publish"})
public class RulePublishListController {

    @Autowired
    private IRulePublishListService rulePublishListService;
    @RequestMapping(value = {"/findAllRulePubList"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.GET)
    public List getAllUsers() {
        List list = rulePublishListService.findAllRulePubList();
        return list;
    }
    /*
     * 抢单发布
     * */
    @Autowired
    private RulePubListServiceImpl rulePubListService;

    /* @RequestMapping(value = "/insertPublist", method = RequestMethod.POST, headers = "Accept=application/json")
     @ResponseBody
     public ResponseEntity<Void> insertPublist(RulePublish rulePublish) {
        try {
             rulePublishListService.insertPublist(rulePublish);
             return ResponseEntity.status(HttpStatus.CREATED).build();
         } catch (Exception e) {
             e.printStackTrace();
         }
         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
     }*/

    @RequestMapping(value = "/insertPublish", method = RequestMethod.POST)
    public Json insert(@RequestBody RulePublish rulePublish) {
        System.out.println("--------------------");
        System.out.println(rulePublish.toString());

        String oper = "query ospStaff";
        byte isDel=1;
        byte isAlive=1;
        int userTypeId=1;
        String ruleDatetimeId="A";
        String publishUserId="1334733333";
        byte orderNum=1;
        if (rulePublish.getIsDel()==null){
            rulePublish.setIsDel(isDel);
        }
        if (rulePublish.getIsAlive()==null){
            rulePublish.setIsAlive(isAlive);
        }
        if(rulePublish.getUserTypeId()==null){
            rulePublish.setUserTypeId(userTypeId);
        }
        if (rulePublish.getRuleDatetimeId()==null){
            rulePublish.setRuleDatetimeId(ruleDatetimeId);
        }
        if (rulePublish.getPublishUserId()==null){
            rulePublish.setPublishUserId(publishUserId);
        }
        if (rulePublish.getOrderNum()==null){
            rulePublish.setOrderNum(orderNum);
        }
        if (rulePublish.getCreateTime()==null){
            rulePublish.setCreateTime(new Date());
        }
        if (rulePublish.getModifyTime()==null){
            rulePublish.setModifyTime(new Date());
        }
        boolean success = rulePublishListService.insertPublist(rulePublish);
        System.out.println(success);
        return Json.result(oper, success);
    }

    @RequestMapping(value = "/queryPublish", method = RequestMethod.POST)
    public Json queryPublish(@RequestBody RulePublish rulePublish) {
        System.out.println("--------------------");
        System.out.println(rulePublish.toString());
        List query = rulePublishListService.queryPublishList(rulePublish);
        String oper = "query ospStaff";
        return Json.succ(oper, query);
    }
}
package com.ocean.controller;

import com.ocean.pojo.RulePublish;
import com.ocean.pojo.TUser;
import com.ocean.service.IRulePublishListService;
import com.ocean.service.impl.RulePubListServiceImpl;
import com.ocean.utils.Json;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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



    @RequestMapping(value = {"/findAllRulePubList"}, produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public List getAllUsers() {
        List list = rulePublishListService.findAllRulePubList();
        return list;
    }

    /*
     * 抢单发布
     * */
//    @Autowired
//    private RulePubListServiceImpl rulePubListService;

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
        String oper = "insert rulePublish";
        TUser tUser = (TUser) SecurityUtils.getSubject().getPrincipal();
        String publishUserId = tUser.getUserId();
        System.out.println(tUser.getUserId());
        byte isDel=0;
        byte isAlive=1;
        //int userTypeId=1;
        String ruleDatetimeId="A";
        //String publishUserId="1334733333";
        Date dateStart=rulePublish.getRulePublishDatetime().getRuleDatetimeStart();
        System.out.printf("datastart:"+dateStart);
        byte orderNum=1;
            rulePublish.setIsDel(isDel);
            rulePublish.setIsAlive(isAlive);
            rulePublish.setUserTypeId(tUser.getUserTypeId());
            rulePublish.setRuleDatetimeId(ruleDatetimeId);
            rulePublish.setPublishUserId(tUser.getUserId());
            rulePublish.getRulePublishDatetime().setOrderNum(orderNum);
            rulePublish.setCreateTime(new Date());
            rulePublish.setModifyTime(new Date());

        boolean success = rulePublishListService.insertPublist(rulePublish);
        System.out.println("------rulepublish:"+rulePublish.toString());
        System.out.println(success);
        return Json.result(oper, success);
    }

    @RequestMapping(value = "/queryPublish", method = RequestMethod.GET)
    public Json queryList(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("--------------------");
        RulePublish rulePublish = new RulePublish();
        List query = rulePublishListService.queryPublishList(rulePublish);
        String oper = "query rulePublish";
        return Json.succ(oper, query);
    }

    @RequestMapping(value = "/selectPublishById", method = RequestMethod.GET)
    public Json selectOnePublish(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("----------query one publish info by id----------");
//        RulePublish rulePublish = new RulePublish();
        Long rulePublishId=Long.parseLong(req.getParameter("rulePublishId"));
        System.out.println("rulePublishId = " + rulePublishId);
        RulePublish rulePublish=rulePublishListService.selectPublishById(rulePublishId);
//        rulePublish.setPublishUserId(rulePublishId);
//        RulePublish rulePublishInfo = rulePublishListService.selectPublishById(rulePublish.getRulePublishId());
        String oper = "query one publish info by id";
//        return Json.succ(oper, rulePublish);
        System.out.printf("rulePublish:"+rulePublish.toString());
        return Json.succ(oper).data("rows", rulePublish);

    }

    @RequestMapping(value = "/myPublish", method = RequestMethod.GET)
    public Json  myPublishSelect(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("------我的发布--------");
        TUser tUser = (TUser) SecurityUtils.getSubject().getPrincipal();
        String publishUserId = tUser.getUserId();
        String oper = "query myPublish info by usrId";
        List myPublish = rulePublishListService.myPublishById(publishUserId);
        return Json.succ(oper).data("rows", myPublish);
    }

    @RequestMapping(value = "/myOnePublishById", method = RequestMethod.GET)
    public Json myOnePublish(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("--------- 单个发布详情 ---------");

        Long rulePublishId = Long.parseLong(req.getParameter("rulePublishId"));
        System.out.println("rulePublishId = " + rulePublishId);
        String oper = "query onepublish info by id and userId";
        TUser tUser = (TUser) SecurityUtils.getSubject().getPrincipal();
        String publishUserId = tUser.getUserId();

        RulePublish rulePublish = rulePublishListService.myOnePublishById(rulePublishId, publishUserId);
        return Json.succ(oper, rulePublish);
    }

    @RequestMapping(value = "/myOnePublishListById", method = RequestMethod.GET)
    public Json myOnePublishList(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("---------- 单个发布列表 ----------");

        Long rulePublishId = Long.parseLong(req.getParameter("rulePublishId"));
        System.out.println("rulePublishId = " + rulePublishId);
        String oper = "query onepublishlist info by id";
        List myPublishList = rulePublishListService.myOnePublishListById(rulePublishId);
        System.out.println(myPublishList);
        return Json.succ(oper).data("rows", myPublishList);
    }

    @RequestMapping(value = "/myOneDayPublishList", method = RequestMethod.GET)
    public Json myOneDayPublishList(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("---------- 单个发布单日抢单列表 ----------");

        Long rulePublishId = Long.parseLong(req.getParameter("rulePublishId"));
        System.out.println("rulePublishId = " + rulePublishId);
        String oper = "query onePublishDayList info by id";
        List myPublishDayList = rulePublishListService.myOnePublishDayList(rulePublishId);
        System.out.println(myPublishDayList);
        return Json.succ(oper).data("rows", myPublishDayList);
    }
}
package com.ocean.controller;

import com.ocean.model.ResultMap;
import com.ocean.pojo.RulePublish;
import com.ocean.service.IRulePublishListService;
import com.ocean.service.impl.RulePubListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = {"/publish"})
public class RulePublishListController {

    @Autowired
    private IRulePublishListService rulePublishListService;
    @Autowired
    private ResultMap resultMap;

    @RequestMapping(value = {"/findAllRulePubList"},produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    public List getAllUsers(){
        List list =  rulePublishListService.findAllRulePubList();
        return list;
    }
    /*
    * 抢单发布
    * */
    @Autowired
    private RulePubListServiceImpl rulePubListService;

//    @RequestMapping(value = "/insertPublist", method = RequestMethod.POST, headers = "Accept=application/json")
//    @ResponseBody
//    public ResponseEntity<Void> insertPublist(RulePublish rulePublish) {
//
//        try {
//            rulePublishListService.insertPublist(rulePublish);
//            return ResponseEntity.status(HttpStatus.CREATED).build();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//    }

    @RequestMapping(value = "/insertPublist", method = RequestMethod.POST, headers = "Accept=application/json")
    @ResponseBody
    @ResponseStatus
    public ResponseEntity<ResultMap> insertPublist(RulePublish rulePublish) {

        try {
            rulePublishListService.insertPublist(rulePublish);
           // return ResponseEntity.status(HttpStatus.CREATED).build();
                //返回数据就为http响应体内容
                ResponseEntity.status(HttpStatus.CREATED).build();
                return ResponseEntity.ok(resultMap.publishSuccess().message("publishSuccess"));
        } catch (Exception e) {
            e.printStackTrace();
         //  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//            return ResponseEntity.badRequest(resultMap.publishFail().message("publishFail"))
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            return ResponseEntity.ok(resultMap.publishFail().message("publishFail"));
        }

    }
}
package com.ocean.controller;

import com.ocean.pojo.TUser;
import com.ocean.utils.Json;
import com.ocean.utils.ResultMap;
import com.ocean.pojo.SnatchInfo;
import com.ocean.service.IInsertSnatInfoService;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = {"/snatchinfo"})
public class SnatchInfoController {
    @Autowired
    private IInsertSnatInfoService iInsertSnatInfoService;
    @Autowired
    private ResultMap resultMap;

//
//    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
//    Date snatchDatetime=new Date();
//    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
//    Date auditDatetime=new Date();

    //    @RequestMapping(value = {"/insert"},produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
//    @ResponseBody
//    @ResponseStatus
//    public ResponseEntity<ResultMap> insertSnatchInfo(SnatchInfo snatchInfo) {
//
//
//        try {
//            iInsertSnatInfoService.insertSnatInfo(snatchInfo);
//            // return ResponseEntity.status(HttpStatus.CREATED).build();
//            //返回数据就为http响应体内容
//            ResponseEntity.status(HttpStatus.CREATED).build();
//            return ResponseEntity.ok(resultMap.snatchSuccess().message("snatchSuccess"));
//        } catch (Exception e) {
//            e.printStackTrace();
//            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//            return ResponseEntity.ok(resultMap.snatchFail().message("snatchFail"));
//        }
//
//    }

    @RequestMapping(value = {"/insert"},method = RequestMethod.POST)
    @ResponseBody
    public Json insertSnatch(@RequestBody SnatchInfo snatchInfo) {
        String oper = "insert Snatch Info";
        // log.info("{}, body: {}", oper, req);
        //获取传入的参数
//        String snatchMobileNumber=req.getParameter("snatchMobileNumber");
//        String snatchUserId=req.getParameter("snatchMobileNumber");
//        String rulePublishId=req.getParameter("snatchMobileNumber");

        String snatchMobileNumber=snatchInfo.getSnatchMobileNumber();
        //   String snatchUserId=snatchInfo.getSnatchUserId();
        String rulePublishId= snatchInfo.getRulePublishId();

        TUser currentTUser = (TUser) SecurityUtils.getSubject().getPrincipal();

        int  isAudit=1;
        int  snatchMoney=50;

        snatchInfo.setSnatchUserId(currentTUser.getUserId());
        snatchInfo.setSnatchDatetime(new Date());
        snatchInfo.setIsAudit((byte)isAudit);
        snatchInfo.setAuditDatetime(new Date());
        snatchInfo.setSnatchMoney((byte)snatchMoney);
//
//        //查询条件类
//        SysUserQuery query = new SysUserQuery();
//        query.setUserCode(userCode);
//        query.setUserName(userName);

        boolean success =iInsertSnatInfoService.insertSnatInfo(snatchInfo);
//
//        List<SysUser> sysUserList = sysUserService.query(query);

        return Json.result(oper,success);
    }


    @RequestMapping(value = "/mySnatchList", method = RequestMethod.GET)
    public Json mySnatchList(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("---------- 我的抢单列表 ----------");

        String oper = "query mySnatchList info by id";
        TUser tUser = (TUser) SecurityUtils.getSubject().getPrincipal();
        String snatchUserId = tUser.getUserId();
        System.out.println("snatchUserId = " + snatchUserId);
        List mySnatchList = iInsertSnatInfoService.mySnatchList(snatchUserId);
        System.out.println(mySnatchList);
        return Json.succ(oper).data("rows", mySnatchList);
    }

    @RequestMapping(value = "/mySnatchDetail", method = RequestMethod.GET)
    public Json mySnatchDetail(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("---------- 我的抢单单个详情 ----------");

        String snatchMobileNumber = req.getParameter("snatchMobileNumber");
        System.out.println("snatchMobileNumber = " + snatchMobileNumber);
        String oper = "query mySnatchDetail info by id";
        SnatchInfo mySnatchDetail = iInsertSnatInfoService.mySnatchDetail(snatchMobileNumber);
        System.out.println(mySnatchDetail);
        return Json.succ(oper).data("rows", mySnatchDetail);
    }

    @RequestMapping(value = "/snatchLatest", method = RequestMethod.GET)
    public Json snatchLatest(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("---------- 抢单头条 ----------");

        String oper = "snatchLatest";
        SnatchInfo mySnatchDetail = iInsertSnatInfoService.snatchLatest();
        System.out.println(mySnatchDetail);
        return Json.succ(oper).data("rows", mySnatchDetail);
    }
    @RequestMapping(value = "/mySnatchSearch", method = RequestMethod.GET)
    public Json mySnatchSearch(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("---------- 我的抢单搜索 ----------");

        String oper = "query mySnatchSearch info by ruleTitle";
        String ruleTitle = req.getParameter("ruleTitle");
        TUser tUser = (TUser) SecurityUtils.getSubject().getPrincipal();
        String snatchUserId = tUser.getUserId();
        List mySnatchSearch = iInsertSnatInfoService.mySnatchSearch(snatchUserId,ruleTitle);
        System.out.println(mySnatchSearch);
        return Json.succ(oper).data("rows", mySnatchSearch);
    }
}



//   import com.elephant.utils.BaseQuery;
//
//       public class SysUserQuery extends BaseQuery{
//           private String userCode;
//           private String userName;
//           public String getUserCode() {
//               return userCode;
//           }
//           public void setUserCode(String userCode) {
//               this.userCode = userCode;
//           }
//           public String getUserName() {
//               return userName;
//           }
//           public void setUserName(String userName) {
//               this.userName = userName;
//           }
//
//       }
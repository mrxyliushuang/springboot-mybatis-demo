package com.ocean.controller;

import com.ocean.utils.Json;
import com.ocean.utils.ResultMap;
import com.ocean.pojo.SnatchInfo;
import com.ocean.service.IInsertSnatInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

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
        String snatchUserId=snatchInfo.getSnatchUserId();
        String rulePublishId= snatchInfo.getRulePublishId();

        int  isAudit=1;

        int  snatchMoney=50;

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
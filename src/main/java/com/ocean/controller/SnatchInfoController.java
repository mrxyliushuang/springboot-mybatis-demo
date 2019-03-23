package com.ocean.controller;

import com.ocean.model.ResultMap;
import com.ocean.pojo.SnatchInfo;
import com.ocean.service.IInsertSnatInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = {"/snatchinfo"})
public class SnatchInfoController {
    @Autowired
    private IInsertSnatInfoService iInsertSnatInfoService;
    @Autowired
    private ResultMap resultMap;

    @RequestMapping(value = {"/insert"},produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    @ResponseBody
    @ResponseStatus
    public ResponseEntity<ResultMap> insertSnatchInfo(SnatchInfo snatchInfo) {

        try {
            iInsertSnatInfoService.insertSnatInfo(snatchInfo);
            // return ResponseEntity.status(HttpStatus.CREATED).build();
            //返回数据就为http响应体内容
            ResponseEntity.status(HttpStatus.CREATED).build();
            return ResponseEntity.ok(resultMap.message("snatchSuccess"));
        } catch (Exception e) {
            e.printStackTrace();
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            return ResponseEntity.ok(resultMap.message("snatcFaild"));
        }

    }
}

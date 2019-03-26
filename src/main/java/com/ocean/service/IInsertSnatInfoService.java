package com.ocean.service;

import com.ocean.pojo.SnatchInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IInsertSnatInfoService {
   public  boolean  insertSnatInfo(SnatchInfo snatchInfo);

   //我的抢单
   List mySnatchList(@Param("snatchUserId") String snatchUserId);

   //我的单个抢单详情
   SnatchInfo mySnatchDetail(String snatchMobileNumber);
}

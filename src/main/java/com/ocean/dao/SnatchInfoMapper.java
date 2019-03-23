package com.ocean.dao;

import com.ocean.pojo.RulePublish;
import com.ocean.pojo.SnatchInfo;

public interface SnatchInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snatch_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long snatchInfoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snatch_info
     *
     * @mbggenerated
     */
    int insert(SnatchInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snatch_info
     *
     * @mbggenerated
     */
    int insertSelective(SnatchInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snatch_info
     *
     * @mbggenerated
     */
    SnatchInfo selectByPrimaryKey(Long snatchInfoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snatch_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SnatchInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table snatch_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SnatchInfo record);

    /*插入抢单信息*/
    boolean insertSnatInfo(SnatchInfo snatchInfo);
}
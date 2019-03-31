package com.ocean.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RulePublish {
    private Long rulePublishId;
    private String ruleTitle;
    private String ruleType;
    private Integer userTypeId;
    private String regionId;
    private String roleId;
    private String ruleContent;
    private String ruleDatetimeId;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date modifyTime;
    private Byte isAlive;
    private Byte isDel;
    private String publishUserId;

    private RulePublishDatetime rulePublishDatetime;

    public RulePublishDatetime getRulePublishDatetime() {
        return rulePublishDatetime;
    }

    public void setRulePublishDatetime(RulePublishDatetime rulePublishDatetime) {
        this.rulePublishDatetime = rulePublishDatetime;
    }

    public Long getRulePublishId() {
        return rulePublishId;
    }

    public void setRulePublishId(Long rulePublishId) {
        this.rulePublishId = rulePublishId;
    }

    public String getRuleTitle() {
        return ruleTitle;
    }


    public void setRuleTitle(String ruleTitle) {
        this.ruleTitle = ruleTitle == null ? null : ruleTitle.trim();
    }

    public String getRuleType() {
        return ruleType;
    }


    public void setRuleType(String ruleType) {
        this.ruleType = ruleType == null ? null : ruleType.trim();
    }


    public Integer getUserTypeId() {
        return userTypeId;
    }


    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }


    public String getRegionId() {
        return regionId;
    }


    public void setRegionId(String regionId) {
        this.regionId = regionId == null ? null : regionId.trim();
    }


    public String getRoleId() {
        return roleId;
    }


    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }


    public String getRuleContent() {
        return ruleContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule_publish.rule_content
     *
     * @param ruleContent the value for rule_publish.rule_content
     *
     * @mbggenerated
     */
    public void setRuleContent(String ruleContent) {
        this.ruleContent = ruleContent == null ? null : ruleContent.trim();
    }

    public String getRuleDatetimeId() {
        return ruleDatetimeId;
    }

    public void setRuleDatetimeId(String ruleDatetimeId) {
        this.ruleDatetimeId = ruleDatetimeId == null ? null : ruleDatetimeId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Byte getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(Byte isAlive) {
        this.isAlive = isAlive;
    }

    public Byte getIsDel() {
        return isDel;
    }

    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    public String getPublishUserId() {
        return publishUserId;
    }


    public void setPublishUserId(String publishUserId) {
        this.publishUserId = publishUserId == null ? null : publishUserId.trim();
    }

    @Override
    public String toString() {
        return "RulePublish{" +
                "rulePublishId=" + rulePublishId +
                ", ruleTitle='" + ruleTitle + '\'' +
                ", ruleType='" + ruleType + '\'' +
                ", userTypeId=" + userTypeId +
                ", regionId='" + regionId + '\'' +
                ", roleId='" + roleId + '\'' +
                ", ruleContent='" + ruleContent + '\'' +
                ", ruleDatetimeId='" + ruleDatetimeId + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", isAlive=" + isAlive +
                ", isDel=" + isDel +
                ", publishUserId='" + publishUserId + '\'' +
                ", rulePublishDatetime=" + rulePublishDatetime +
                '}';
    }
}
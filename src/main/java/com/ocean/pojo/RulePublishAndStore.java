package com.ocean.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RulePublishAndStore {
    private String ruleTitle;
    private String ruleType;
    private Integer userTypeId;
    private String ruleContent;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifyTime;
    private Byte isAlive;
    private Byte isDel;

    private String storeName;
    private String regionName;
    private String cityName;

    private String userName;

    @Override
    public String toString() {
        return "RulePublishAndStore{" +
                ", ruleTitle='" + ruleTitle + '\'' +
                ", ruleType='" + ruleType + '\'' +
                ", userTypeId=" + userTypeId +
                ", ruleContent='" + ruleContent + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", isAlive=" + isAlive +
                ", isDel=" + isDel +
                ", storeName='" + storeName + '\'' +
                ", regionName='" + regionName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }


    public String getRuleTitle() {
        return ruleTitle;
    }

    public void setRuleTitle(String ruleTitle) {
        this.ruleTitle = ruleTitle;
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getRuleContent() {
        return ruleContent;
    }

    public void setRuleContent(String ruleContent) {
        this.ruleContent = ruleContent;
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

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

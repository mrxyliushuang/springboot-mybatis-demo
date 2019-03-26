package com.ocean.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SnatchInfo extends RulePublishAndStore{
    private Long snatchInfoId;
    private String snatchMobileNumber;
    private String snatchUserId;
    private String rulePublishId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date snatchDatetime;
    private Byte isAudit;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date auditDatetime;
    private Byte snatchMoney;
    private RulePublishDatetime rulePublishDatetime;

    public RulePublishDatetime getRulePublishDatetime() {
        return rulePublishDatetime;
    }

    public void setRulePublishDatetime(RulePublishDatetime rulePublishDatetime) {
        this.rulePublishDatetime = rulePublishDatetime;
    }

    public Long getSnatchInfoId() {
        return snatchInfoId;
    }
    public void setSnatchInfoId(Long snatchInfoId) {
        this.snatchInfoId = snatchInfoId;
    }
    public String getSnatchMobileNumber() {
        return snatchMobileNumber;
    }

    public void setSnatchMobileNumber(String snatchMobileNumber) {
        this.snatchMobileNumber = snatchMobileNumber == null ? null : snatchMobileNumber.trim();
    }
    public String getSnatchUserId() {
        return snatchUserId;
    }

    public void setSnatchUserId(String snatchUserId) {
        this.snatchUserId = snatchUserId == null ? null : snatchUserId.trim();
    }
    public String getRulePublishId() {
        return rulePublishId;
    }
    public void setRulePublishId(String rulePublishId) {
        this.rulePublishId = rulePublishId == null ? null : rulePublishId.trim();
    }
    public Date getSnatchDatetime() {
        return snatchDatetime;
    }
    public void setSnatchDatetime(Date snatchDatetime) {
        this.snatchDatetime = snatchDatetime;
    }
    public Byte getIsAudit() {
        return isAudit;
    }
    public void setIsAudit(Byte isAudit) {
        this.isAudit = isAudit;
    }
    public Date getAuditDatetime() {
        return auditDatetime;
    }
    public void setAuditDatetime(Date auditDatetime) {
        this.auditDatetime = auditDatetime;
    }
    public Byte getSnatchMoney() {
        return snatchMoney;
    }
    public void setSnatchMoney(Byte snatchMoney) {
        this.snatchMoney = snatchMoney;
    }

    @Override
    public String toString() {
        return "SnatchInfo{" +
                "snatchInfoId=" + snatchInfoId +
                ", snatchMobileNumber='" + snatchMobileNumber + '\'' +
                ", snatchUserId='" + snatchUserId + '\'' +
                ", rulePublishId='" + rulePublishId + '\'' +
                ", snatchDatetime=" + snatchDatetime +
                ", isAudit=" + isAudit +
                ", auditDatetime=" + auditDatetime +
                ", snatchMoney=" + snatchMoney +
                ", rulePublishDatetime=" + rulePublishDatetime +
                '}';
    }
}
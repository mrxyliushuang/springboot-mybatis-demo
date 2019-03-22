package com.ocean.pojo;

import java.util.Date;

public class RulePublish {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule_publish.rule_publish_id
     *
     * @mbggenerated
     */
    private Long rulePublishId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule_publish.rule_title
     *
     * @mbggenerated
     */
    private String ruleTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule_publish.rule_type
     *
     * @mbggenerated
     */
    private String ruleType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule_publish.rule_content
     *
     * @mbggenerated
     */
    private String ruleContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule_publish.rule_datetime_id
     *
     * @mbggenerated
     */
    private String ruleDatetimeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule_publish.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule_publish.modify_time
     *
     * @mbggenerated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule_publish.is_alive
     *
     * @mbggenerated
     */
    private Byte isAlive;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule_publish.is_del
     *
     * @mbggenerated
     */
    private Byte isDel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rule_publish.publish_user_id
     *
     * @mbggenerated
     */
    private String publishUserId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule_publish.rule_publish_id
     *
     * @return the value of rule_publish.rule_publish_id
     *
     * @mbggenerated
     */
    public Long getRulePublishId() {
        return rulePublishId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule_publish.rule_publish_id
     *
     * @param rulePublishId the value for rule_publish.rule_publish_id
     *
     * @mbggenerated
     */
    public void setRulePublishId(Long rulePublishId) {
        this.rulePublishId = rulePublishId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule_publish.rule_title
     *
     * @return the value of rule_publish.rule_title
     *
     * @mbggenerated
     */
    public String getRuleTitle() {
        return ruleTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule_publish.rule_title
     *
     * @param ruleTitle the value for rule_publish.rule_title
     *
     * @mbggenerated
     */
    public void setRuleTitle(String ruleTitle) {
        this.ruleTitle = ruleTitle == null ? null : ruleTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule_publish.rule_type
     *
     * @return the value of rule_publish.rule_type
     *
     * @mbggenerated
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule_publish.rule_type
     *
     * @param ruleType the value for rule_publish.rule_type
     *
     * @mbggenerated
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType == null ? null : ruleType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule_publish.rule_content
     *
     * @return the value of rule_publish.rule_content
     *
     * @mbggenerated
     */
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

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule_publish.rule_datetime_id
     *
     * @return the value of rule_publish.rule_datetime_id
     *
     * @mbggenerated
     */
    public String getRuleDatetimeId() {
        return ruleDatetimeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule_publish.rule_datetime_id
     *
     * @param ruleDatetimeId the value for rule_publish.rule_datetime_id
     *
     * @mbggenerated
     */
    public void setRuleDatetimeId(String ruleDatetimeId) {
        this.ruleDatetimeId = ruleDatetimeId == null ? null : ruleDatetimeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule_publish.create_time
     *
     * @return the value of rule_publish.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule_publish.create_time
     *
     * @param createTime the value for rule_publish.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule_publish.modify_time
     *
     * @return the value of rule_publish.modify_time
     *
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule_publish.modify_time
     *
     * @param modifyTime the value for rule_publish.modify_time
     *
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule_publish.is_alive
     *
     * @return the value of rule_publish.is_alive
     *
     * @mbggenerated
     */
    public Byte getIsAlive() {
        return isAlive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule_publish.is_alive
     *
     * @param isAlive the value for rule_publish.is_alive
     *
     * @mbggenerated
     */
    public void setIsAlive(Byte isAlive) {
        this.isAlive = isAlive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule_publish.is_del
     *
     * @return the value of rule_publish.is_del
     *
     * @mbggenerated
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule_publish.is_del
     *
     * @param isDel the value for rule_publish.is_del
     *
     * @mbggenerated
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rule_publish.publish_user_id
     *
     * @return the value of rule_publish.publish_user_id
     *
     * @mbggenerated
     */
    public String getPublishUserId() {
        return publishUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rule_publish.publish_user_id
     *
     * @param publishUserId the value for rule_publish.publish_user_id
     *
     * @mbggenerated
     */
    public void setPublishUserId(String publishUserId) {
        this.publishUserId = publishUserId == null ? null : publishUserId.trim();
    }

}
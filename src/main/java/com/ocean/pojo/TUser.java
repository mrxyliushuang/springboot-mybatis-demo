package com.ocean.pojo;

import java.util.Date;

public class TUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_id
     *
     * @mbggenerated
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.store_id
     *
     * @mbggenerated
     */
    private String storeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_type
     *
     * @mbggenerated
     */
    private String userType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_type_id
     *
     * @mbggenerated
     */
    private Integer userTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.pass_word
     *
     * @mbggenerated
     */
    private String passWord;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_state
     *
     * @mbggenerated
     */
    private Integer userState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.modify_time
     *
     * @mbggenerated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.is_del
     *
     * @mbggenerated
     */
    private Byte isDel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_id
     *
     * @return the value of t_user.user_id
     *
     * @mbggenerated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_id
     *
     * @param userId the value for t_user.user_id
     *
     * @mbggenerated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_name
     *
     * @return the value of t_user.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_name
     *
     * @param userName the value for t_user.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.store_id
     *
     * @return the value of t_user.store_id
     *
     * @mbggenerated
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.store_id
     *
     * @param storeId the value for t_user.store_id
     *
     * @mbggenerated
     */
    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_type
     *
     * @return the value of t_user.user_type
     *
     * @mbggenerated
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_type
     *
     * @param userType the value for t_user.user_type
     *
     * @mbggenerated
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_type_id
     *
     * @return the value of t_user.user_type_id
     *
     * @mbggenerated
     */
    public Integer getUserTypeId() {
        return userTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_type_id
     *
     * @param userTypeId the value for t_user.user_type_id
     *
     * @mbggenerated
     */
    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.pass_word
     *
     * @return the value of t_user.pass_word
     *
     * @mbggenerated
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.pass_word
     *
     * @param passWord the value for t_user.pass_word
     *
     * @mbggenerated
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_state
     *
     * @return the value of t_user.user_state
     *
     * @mbggenerated
     */
    public Integer getUserState() {
        return userState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_state
     *
     * @param userState the value for t_user.user_state
     *
     * @mbggenerated
     */
    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.create_time
     *
     * @return the value of t_user.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.create_time
     *
     * @param createTime the value for t_user.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.modify_time
     *
     * @return the value of t_user.modify_time
     *
     * @mbggenerated
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.modify_time
     *
     * @param modifyTime the value for t_user.modify_time
     *
     * @mbggenerated
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.is_del
     *
     * @return the value of t_user.is_del
     *
     * @mbggenerated
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.is_del
     *
     * @param isDel the value for t_user.is_del
     *
     * @mbggenerated
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", userId:'" + userId + '\'' +
                ", userName:'" + userName + '\'' +
                ", storeId:'" + storeId + '\'' +
                ", userType:'" + userType + '\'' +
                ", userTypeId:" + userTypeId +
                ", passWord:'" + passWord + '\'' +
                ", userState:" + userState +
                ", createTime:" + createTime +
                ", modifyTime:" + modifyTime +
                ", isDel:" + isDel +
                '}';
    }
}
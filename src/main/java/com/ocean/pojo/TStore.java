package com.ocean.pojo;

public class TStore {
    private String storeId;
    private String storeName;
    private String regionId;
    private String regionName;
    private String cityId;
    private String cityName;
    public String getStoreId() {
        return storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_store.store_id
     *
     * @param storeId the value for t_store.store_id
     *
     * @mbggenerated
     */
    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_store.store_name
     *
     * @return the value of t_store.store_name
     *
     * @mbggenerated
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_store.store_name
     *
     * @param storeName the value for t_store.store_name
     *
     * @mbggenerated
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_store.region_id
     *
     * @return the value of t_store.region_id
     *
     * @mbggenerated
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_store.region_id
     *
     * @param regionId the value for t_store.region_id
     *
     * @mbggenerated
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId == null ? null : regionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_store.region_name
     *
     * @return the value of t_store.region_name
     *
     * @mbggenerated
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_store.region_name
     *
     * @param regionName the value for t_store.region_name
     *
     * @mbggenerated
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_store.city_id
     *
     * @return the value of t_store.city_id
     *
     * @mbggenerated
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_store.city_id
     *
     * @param cityId the value for t_store.city_id
     *
     * @mbggenerated
     */
    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_store.city_name
     *
     * @return the value of t_store.city_name
     *
     * @mbggenerated
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_store.city_name
     *
     * @param cityName the value for t_store.city_name
     *
     * @mbggenerated
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }
}
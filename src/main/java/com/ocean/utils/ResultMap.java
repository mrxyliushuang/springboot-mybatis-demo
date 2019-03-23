package com.ocean.utils;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description 接口返回对象
 * @Date 2018-03-17
 * @Time 22:25
 */
@Component
public class ResultMap extends HashMap<String, Object> {
    public ResultMap() {
    }

    public ResultMap success() {
        this.put("result", "loginSuccess");
        return this;
    }

    public ResultMap fail() {
        this.put("result", "loginFail");
        return this;
    }

    //发布插入返回数据成功
    public ResultMap publishSuccess(){
        this.put("result","publishSuccess");
        return this;
    }

    //发布插入返回数据失败
    public ResultMap publishFail(){
        this.put("result","publishFail");
        return this;
    }

    //抢单插入返回数据成功
    public ResultMap snatchSuccess(){
        this.put("result","snatchSuccess");
        return this;
    }

    //抢单插入返回数据失败
    public ResultMap snatchFail(){
        this.put("result","snatchFail");
        return this;
    }

    public ResultMap message(Object message) {
        this.put("message", message);
        return this;
    }
}
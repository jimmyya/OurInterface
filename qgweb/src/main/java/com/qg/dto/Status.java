package com.qg.dto;

/**
 * Created by CHEN on 2016/7/22.
 */
public class Status {
    public static final int SUCCESS=2000; //成功
    public static final int ERROR=5000; //失败
    public static final int PASSWORD_ERROR=5001;  //密码错误
    public static final int USER_NO_FIND=5002;  //用户没有找到
    public static final int POWER_LIMIT=5003;   //权限不够
}

package com.qg.dto;

/**
 * Created by CHEN on 2016/7/18.
 * 返回的json结果包
 * 状态码     约定
 * 2000      成功
 * 5000      失败
 * 5001      账号密码错误
 * 5002      没有该用户
 */
public class Results<T> {
    private int status;
    private T data;
    private String message;

    public Results() {
        super();
    }

    public Results(int status) {
        this.status = status;
    }

    public Results(int status, T data) {
        this.status = status;
        this.data = data;
    }

    public Results(int status, T data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

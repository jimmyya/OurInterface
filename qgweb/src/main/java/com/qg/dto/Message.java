package com.qg.dto;

/**
 * Created by CHEN on 2016/7/22.
 * 返回的json结果包
 */
public class Message {
    private int status;
    private String message;

    public Message(int status) {
        this.status = status;
    }

    public Message(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

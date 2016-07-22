package com.qg.entity;

/**
 * Created by CHEN on 2016/7/17.
 */
public class User {
    private int userId;
    private String username;
    private String password;
    private int powerLimit;

    public User() {
        super();
    }

    public User(String username) {
        this.username = username;
    }

    public User(int userId, String username, String password, int powerLimit) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.powerLimit = powerLimit;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPowerLimit() {
        return powerLimit;
    }

    public void setPowerLimit(int powerLimit) {
        this.powerLimit = powerLimit;
    }


}
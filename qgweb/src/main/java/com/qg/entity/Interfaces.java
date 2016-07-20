package com.qg.entity;

/**
 * Created by CHEN on 2016/7/17.
 */
public class Interfaces {
    private int id;  //id
    private String name;  //接口名
    private String url;  //接口URL
    private String format;  //支持的格式
    private String requestMethod;  //请求的方式
    private String powerLimit;  //权限
    private String author;  //作者
    private String description;  //描述
    private String requestResult;  //返回的结果
    private int systemId;  //系统Id
    private Fields fields; //字段对象


    public Interfaces(int id, String name, String url, String format,
                      String requestMethod, String powerLimit,
                      String author, String description,
                      String requestResult) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.format = format;
        this.requestMethod = requestMethod;
        this.powerLimit = powerLimit;
        this.author = author;
        this.description = description;
        this.requestResult = requestResult;
    }

    public Interfaces(String name, String url, String format,
                      String requestMethod, String powerLimit,
                      String author, String description,
                      String requestResult, int systemId) {
        this.name = name;
        this.url = url;
        this.format = format;
        this.requestMethod = requestMethod;
        this.powerLimit = powerLimit;
        this.author = author;
        this.description = description;
        this.requestResult = requestResult;
        this.systemId = systemId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getPowerLimit() {
        return powerLimit;
    }

    public void setPowerLimit(String powerLimit) {
        this.powerLimit = powerLimit;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }

    public int getSystemId() {
        return systemId;
    }

    public void setSystemId(int systemId) {
        this.systemId = systemId;
    }

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }
}

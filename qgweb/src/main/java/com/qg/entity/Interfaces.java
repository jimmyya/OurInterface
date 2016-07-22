package com.qg.entity;

/**
 * Created by CHEN on 2016/7/17.
 */
public class Interfaces {
    private int interfaceId;  //id
    private String interfaceName;  //接口名
    private String interfaceUrl;  //接口URL
    private String interfaceFormat;  //支持的格式
    private String interfaceRequestMethod;  //请求的方式
    private String interfacePowerLimit;  //权限
    private String interfaceAuthor;  //作者
    private String interfaceDescription;  //描述
    private String interfaceRequestResult;  //返回的结果
    private int systemId;  //系统Id
    private Fields fields; //字段对象


    public Interfaces(int interfaceId, String interfaceName, String interfaceUrl, String interfaceFormat, String interfaceRequestMethod, String interfacePowerLimit, String interfaceAuthor, String interfaceDescription, String interfaceRequestResult) {
        this.interfaceId = interfaceId;
        this.interfaceName = interfaceName;
        this.interfaceUrl = interfaceUrl;
        this.interfaceFormat = interfaceFormat;
        this.interfaceRequestMethod = interfaceRequestMethod;
        this.interfacePowerLimit = interfacePowerLimit;
        this.interfaceAuthor = interfaceAuthor;
        this.interfaceDescription = interfaceDescription;
        this.interfaceRequestResult = interfaceRequestResult;
    }

    public Interfaces(int interfaceId, String interfaceName, String interfaceUrl, String interfaceFormat, String interfaceRequestMethod, String interfacePowerLimit, String interfaceAuthor, String interfaceDescription, String interfaceRequestResult, int systemId) {
        this.interfaceId = interfaceId;
        this.interfaceName = interfaceName;
        this.interfaceUrl = interfaceUrl;
        this.interfaceFormat = interfaceFormat;
        this.interfaceRequestMethod = interfaceRequestMethod;
        this.interfacePowerLimit = interfacePowerLimit;
        this.interfaceAuthor = interfaceAuthor;
        this.interfaceDescription = interfaceDescription;
        this.interfaceRequestResult = interfaceRequestResult;
        this.systemId = systemId;
    }

    public int getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(int interfaceId) {
        this.interfaceId = interfaceId;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getInterfaceUrl() {
        return interfaceUrl;
    }

    public void setInterfaceUrl(String interfaceUrl) {
        this.interfaceUrl = interfaceUrl;
    }

    public String getInterfaceFormat() {
        return interfaceFormat;
    }

    public void setInterfaceFormat(String interfaceFormat) {
        this.interfaceFormat = interfaceFormat;
    }

    public String getInterfaceRequestMethod() {
        return interfaceRequestMethod;
    }

    public void setInterfaceRequestMethod(String interfaceRequestMethod) {
        this.interfaceRequestMethod = interfaceRequestMethod;
    }

    public String getInterfacePowerLimit() {
        return interfacePowerLimit;
    }

    public void setInterfacePowerLimit(String interfacePowerLimit) {
        this.interfacePowerLimit = interfacePowerLimit;
    }

    public String getInterfaceAuthor() {
        return interfaceAuthor;
    }

    public void setInterfaceAuthor(String interfaceAuthor) {
        this.interfaceAuthor = interfaceAuthor;
    }

    public String getInterfaceDescription() {
        return interfaceDescription;
    }

    public void setInterfaceDescription(String interfaceDescription) {
        this.interfaceDescription = interfaceDescription;
    }

    public String getInterfaceRequestResult() {
        return interfaceRequestResult;
    }

    public void setInterfaceRequestResult(String interfaceRequestResult) {
        this.interfaceRequestResult = interfaceRequestResult;
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

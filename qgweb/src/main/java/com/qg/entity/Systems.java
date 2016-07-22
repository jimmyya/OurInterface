package com.qg.entity;

/**
 * Created by CHEN on 2016/7/17.
 */
public class Systems {

    private int systemId;
    private String systemName;
    private String systemDescription;

    public Systems() {
        super();
    }

    public Systems(String systemName, String systemDescription) {
        this.systemName = systemName;
        this.systemDescription = systemDescription;
    }

    public Systems(int systemId, String systemName, String systemDescription) {
        this.systemId = systemId;
        this.systemName = systemName;
        this.systemDescription = systemDescription;
    }

    public int getSystemId() {
        return systemId;
    }

    public void setSystemId(int systemId) {
        this.systemId = systemId;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemDescription() {
        return systemDescription;
    }

    public void setSystemDescription(String systemDescription) {
        this.systemDescription = systemDescription;
    }
}

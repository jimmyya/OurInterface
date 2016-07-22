package com.qg.entity;

/**
 * Created by CHEN on 2016/7/17.
 */
public class Systems {

    private int id;
    private String name;
    private String description;

    public Systems() {
        super();
    }

    public Systems(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Systems(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

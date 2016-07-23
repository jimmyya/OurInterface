package com.qg.entity;

/**
 * Created by CHEN on 2016/7/17.
 */
public class Fields {
    private int fieldId;
    private String fieldName;  //
    private String fieldAttribute;  //属性
    private String fieldDescription;  //描述
    private String fieldFefaultValue;  //默认值
    private String fieldExplain;  //说明
    private int interfaceId;  //接口Id

    private String fieldModifyUrl;
    private String fieldDeleteUrl;

    public Fields() {
        super();
    }

    public Fields(int fieldId, String fieldName, String fieldAttribute, String fieldDescription, String fieldFefaultValue, String fieldExplain, int interfaceId) {
        this.fieldId = fieldId;
        this.fieldName = fieldName;
        this.fieldAttribute = fieldAttribute;
        this.fieldDescription = fieldDescription;
        this.fieldFefaultValue = fieldFefaultValue;
        this.fieldExplain = fieldExplain;
        this.interfaceId = interfaceId;
    }

    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldAttribute() {
        return fieldAttribute;
    }

    public void setFieldAttribute(String fieldAttribute) {
        this.fieldAttribute = fieldAttribute;
    }

    public String getFieldDescription() {
        return fieldDescription;
    }

    public void setFieldDescription(String fieldDescription) {
        this.fieldDescription = fieldDescription;
    }

    public String getFieldFefaultValue() {
        return fieldFefaultValue;
    }

    public void setFieldFefaultValue(String fieldFefaultValue) {
        this.fieldFefaultValue = fieldFefaultValue;
    }

    public String getFieldExplain() {
        return fieldExplain;
    }

    public void setFieldExplain(String fieldExplain) {
        this.fieldExplain = fieldExplain;
    }

    public int getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(int interfaceId) {
        this.interfaceId = interfaceId;
    }

    public String getFieldDeleteUrl() {
        return fieldDeleteUrl;
    }

    public void setFieldDeleteUrl(String fieldDeleteUrl) {
        this.fieldDeleteUrl = fieldDeleteUrl;
    }

    public String getFieldModifyUrl() {
        return fieldModifyUrl;
    }

    public void setFieldModifyUrl(String fieldModifyUrl) {
        this.fieldModifyUrl = fieldModifyUrl;
    }
}

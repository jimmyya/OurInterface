package com.qg.dao;

import com.qg.entity.Fields;

import java.util.List;

/**
 * Created by CHEN on 2016/7/17.
 */
public interface FieldDao {

    /**
     * 根据接口Id查询字段
     * @param interfaceId  接口id
     * @return Field(id,name,attribute,description,defaultValue,explain,interfaceId)
     */
    List<Fields> queryByInterfaceId(int interfaceId);

    /**
     * 根据field的Id修改已变化的内容
     * @param field 字段
     * @return Field(id,name,attribute,description,defaultValue,explain,interfaceId)
     */
    boolean modifyField(Fields field);


    /**
     * 根据field
     * @param fieldId  字段的Id
     * @return false 失败 true
     */
    boolean deleteByFieldId(int fieldId);

    /**
     * 新增字段
     * @param field
     * @return
     */
    boolean insertField(Fields field);

}

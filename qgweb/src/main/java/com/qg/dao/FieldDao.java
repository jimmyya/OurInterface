package com.qg.dao;

import com.qg.entity.Fields;

/**
 * Created by CHEN on 2016/7/17.
 */
public interface FieldDao {

    /**
     * 根据接口Id查询字段
     * @param interfaceId  接口id
     * @return Field(id,name,attribute,description,defaultValue,explain,interfaceId)
     */
    Fields queryByInterfaceId(int interfaceId);

    /**
     * 根据field的Id修改已变化的内容
     * @param field 字段
     * @return Field(id,name,attribute,description,defaultValue,explain,interfaceId)
     */
    Fields updateByFieldId(Fields field);


    /**
     * 根据field
     * @param fieldId  字段的Id
     * @return false 失败 true
     */
    boolean deleteByFieldId(int fieldId);

}

package com.qg.service.impl;

import com.qg.dao.FieldDao;
import com.qg.entity.Fields;
import com.qg.entity.PowerLimit;
import com.qg.service.FieldService;
import com.qg.utils.MyUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by CHEN on 2016/7/19.
 */
@Service
public class FieldServiceImpl implements FieldService{

    @Autowired
    private FieldDao fieldDao;
    public List<Fields> queryByInterfaceId(int interfaceId,int powerLimit) {
        List<Fields> fieldList=fieldDao.queryByInterfaceId(interfaceId);
        if(powerLimit>= PowerLimit.ALLER) {
            for(Fields field:fieldList) {
                field.setFieldModifyUrl("/field/"+ MyUUID.getCode()+"/"+field.getFieldId());
                field.setFieldDeleteUrl("/field/"+MyUUID.getCode()+"/"+field.getFieldId());
            }
        } else if(powerLimit>=PowerLimit.ADDER) {
            for(Fields field:fieldList) {
                field.setFieldModifyUrl("/field/" + MyUUID.getCode2() + "/" + field.getFieldId());
            }
        } else {
            //
        }

        return fieldList;
    }

    public boolean modifyField(Fields field) {
        return fieldDao.modifyField(field);
    }

    public boolean deleteField(int fieldId) {
        return fieldDao.deleteByFieldId(fieldId);
    }

    public boolean insertField(Fields field) {
        return fieldDao.insertField(field);
    }
}

package com.qg.service;

import com.qg.dto.Results;
import com.qg.entity.Fields;

import java.util.List;

/**
 * Created by CHEN on 2016/7/19.
 */
public interface FieldService {

    List<Fields> queryByInterfaceId(int interfaceId,int powerLimit);

    boolean modifyField(Fields field);

    boolean deleteField(int fieldId);

    boolean insertField(Fields field);

}

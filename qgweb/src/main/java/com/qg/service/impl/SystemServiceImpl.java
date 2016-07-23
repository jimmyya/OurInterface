package com.qg.service.impl;

import com.qg.dao.SystemDao;
import com.qg.entity.PowerLimit;
import com.qg.entity.Systems;
import com.qg.service.SystemService;
import com.qg.utils.MyUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by CHEN on 2016/7/19.
 */
@Service
public class SystemServiceImpl implements SystemService{

    @Autowired
    private SystemDao systemDao;

    public List<Systems> getAllSystems(int powerLimit) {
        List<Systems> systemList=systemDao.queryAll();
        if(powerLimit>= PowerLimit.ALLER) {
            for(Systems system:systemList) {
                system.setSystemModifyUrl("/system/"+ MyUUID.getCode()+"/"+system.getSystemId());
                system.setSystemDeleteUrl("/system/"+MyUUID.getCode()+"/"+system.getSystemId());
            }
        } else if(powerLimit>=PowerLimit.ADDER) {
            for(Systems system:systemList) {
                system.setSystemModifyUrl("/system/" + MyUUID.getCode2() + "/" + system.getSystemId());
            }
        } else {
            //
        }
        return systemList;
    }

    public boolean insertSystem(Systems system) {
        return systemDao.insertSystem(system);
    }

    public boolean deleteSystem(int systemId) {
        return systemDao.deleteBySystemId(systemId);
    }

    public boolean modifySystem(Systems system) {
        return systemDao.modifySystem(system);
    }
}

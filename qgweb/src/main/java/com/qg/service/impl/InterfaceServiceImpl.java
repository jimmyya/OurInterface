package com.qg.service.impl;

import com.qg.dao.InterfaceDao;
import com.qg.entity.Interfaces;
import com.qg.entity.PowerLimit;
import com.qg.service.InterfaceService;
import com.qg.utils.MyUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by CHEN on 2016/7/19.
 */
@Service
public class InterfaceServiceImpl implements InterfaceService{
    @Autowired
    private InterfaceDao interfaceDao;

    public List<Interfaces> queryBySystemId(int systemId) {
        return interfaceDao.queryBySystemId(systemId);
    }

    public List<Interfaces> queryByInterfaceName(String interfaceName) {
        return interfaceDao.queryByInterfacesName(interfaceName);
    }

    public Interfaces queryByInterfaceId(int interfaceId,int powerLimit) {
        Interfaces interfaces=interfaceDao.queryByInterfacesId(interfaceId);
        if(powerLimit>= PowerLimit.ALLER) {
            interfaces.setInterfaceModifyUrl("/interface/"+ MyUUID.getCode()+"/"+interfaces.getInterfaceId());
            interfaces.setInterfaceDeleteUrl("/interface/"+MyUUID.getCode()+"/"+interfaces.getInterfaceId());
        } else if(powerLimit>=PowerLimit.ADDER) {
            interfaces.setInterfaceModifyUrl("/system/"+ MyUUID.getCode2()+"/"+interfaces.getInterfaceId());
        } else {
            //
        }
        return interfaces;
    }

    public boolean deleteInterfaceById(int interfaceId) {
        return interfaceDao.deleteByInterfacesId(interfaceId);
    }

    public boolean modifyInterface(Interfaces interfaces) {
        return interfaceDao.modifyInterface(interfaces);
    }

    public boolean insertInterface(Interfaces interfaces) {
        return interfaceDao.insertInterface(interfaces);
    }

}

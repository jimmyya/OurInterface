package com.qg.service.impl;

import com.qg.dao.SystemDao;
import com.qg.entity.Systems;
import com.qg.service.SystemService;
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

    public List<Systems> getAllSystems() {
        return systemDao.queryAll();
    }

    public boolean insertSystem(Systems system) {
        return systemDao.insertSystem(system);
    }

    public boolean deleteSystem(int systemId) {
        return false;
    }

    public boolean modifySystem(Systems system) {
        return false;
    }
}

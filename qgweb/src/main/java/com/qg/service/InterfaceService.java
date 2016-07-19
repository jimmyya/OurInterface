package com.qg.service;

import com.qg.entity.Interfaces;

import java.util.List;

/**
 * Created by CHEN on 2016/7/19.
 */
public interface InterfaceService {

    List<Interfaces> queryBySystemId(int systemId);

    List<Interfaces> queryByInterfaceName(String interfaceName);

}

package com.qg.dao;

import com.qg.entity.Interfaces;

/**
 * Created by CHEN on 2016/7/17.
 */
public interface InterfaceDao {
    /**
     * 根据系统的Id查询所有的接口Id 和接口名字 接口路径
     * @param systemId  系统的Id
     * @return Interfaces(id,name,url)
     */
    Interfaces queryBySystemId(int systemId);

    /**
     * 根据接口的Id 查询接口的详情
     * @param interfacesId  接口Id
     * @return 接口详情
     */
    Interfaces queryByInterfacesId(int interfacesId);

    /**
     * 根据接口名字进行模糊查询
     * @param interfacesName  接口名字
     * @return Interfaces(id,name,url)
     */
    Interfaces queryByInterfacesName(String interfacesName);

    /**
     * 根据接口的URL进行模糊查询
     * @param interfacesUrl  接口路径
     * @return Interfaces(id,name,url)
     */
    Interfaces queryByInterfacesUrl(String interfacesUrl);

    /**
     * 根据系统的Id删除接口
     * @param systemId  系统Id
     * @return false 失败 true 成功
     */
    boolean deleteBySystemId(int systemId);

    /**
     * 根据接口的Id删除接口
     * @param interfacesId  接口Id
     * @return false 失败 true 成功
     */
    boolean deleteByInterfacesId(int interfacesId);

}

package com.qg.dao;

import com.qg.entity.Systems;

import java.util.List;

/**
 * Created by CHEN on 2016/7/17.
 */
public interface SystemDao {

    /**
     * 查询所有的系统详情
     * @return  Systems(id,name.description)
     */
    List<Systems> queryAll();

    /**
     * 根据系统Id查询所有的Id
     * @param systemId 系统Id
     * @return  Systems(id,name,description)
     */
    Systems queryBySystemId(int systemId);

    /**
     * 增加一个系统
     * @param system 系统详情
     * @return  false 失败 true 成功
     */
    boolean insertSystem(Systems system);

    /**
     * 根据
     * @param systemId 系统Id
     * @return  false 失败 true 成功
     */
    boolean deleteBySystemId(int systemId);

    /**
     * 修改系统详情
     * @param system  系统详情
     * @return  false 失败 true 成功
     */
    boolean modifySystem(Systems system);
}

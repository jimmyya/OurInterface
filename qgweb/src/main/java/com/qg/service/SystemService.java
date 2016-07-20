package com.qg.service;

import com.qg.entity.Systems;

import java.util.List;

/**
 * Created by CHEN on 2016/7/19.
 */
public interface SystemService {
    /**
     * 返回所有的系统详情
     */
    List<Systems> getAllSystems();

    /**
     * 增加一个系统
     * @param systems 系统详情
     * @return false 失败 true 成功
     */
    boolean insertSystem(Systems system);

    /**
     * 删除系统详情
     * @param systemId 系统Id
     * @return  false 失败 true 成功
     */
    boolean deleteSystem(int systemId);

    /**
     * 修改系统详情
     * @param system  系统详情
     * @return  false 失败  true 成功
     */
    boolean modifySystem(Systems system);
}

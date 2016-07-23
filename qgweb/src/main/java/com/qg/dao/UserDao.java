package com.qg.dao;

import com.qg.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by CHEN on 2016/7/17.
 * 用户数据库接口
 */
public interface UserDao {

    /**
     * @param username  用户名
     * @param password  用户密码
     * @return User(id,powerLimit)
     */
    User queryByPassword(@Param("username") String username,@Param("password")String password);


    /**
     *
     * @param cookiedId
     * @return
     */
    User queryByCookieId(String cookiedId);
}

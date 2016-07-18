package com.qg.service;

import com.qg.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by CHEN on 2016/7/18.
 */
public interface UserService {
    /**
     * 根据username 和password 查找用户 成功返回用户 失败返回空
     * @param username  用户名
     * @param password  密码
     * @return User(id,username,password,powerLimit)
     */
    User queryByPassword(String username,String password);
}

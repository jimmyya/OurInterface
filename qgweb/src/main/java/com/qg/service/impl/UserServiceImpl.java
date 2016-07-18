package com.qg.service.impl;

import com.qg.dao.UserDao;
import com.qg.entity.User;
import com.qg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by CHEN on 2016/7/18.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    public User queryByPassword(String username, String password) {
        User user=userDao.queryByPassword(username,password);
        if(user!=null) {
            user.setUsername(username);
            user.setPassword(password);
        }
        return user;
    }
}

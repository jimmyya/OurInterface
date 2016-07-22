package com.qg.listener;

import com.qg.entity.PowerLimit;
import com.qg.entity.User;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by CHEN on 2016/7/22.
 */
public class MySession implements HttpSessionListener{
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("注入用户");
        HttpSession session =se.getSession();
        session.setAttribute("user",new User(1,"chen","", PowerLimit.ALLER));
    }

    public void sessionDestroyed(HttpSessionEvent se) {

    }
}

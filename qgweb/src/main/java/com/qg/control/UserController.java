package com.qg.control;

import com.qg.entity.User;
import com.qg.service.UserService;
import com.qg.utils.MyMD5;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.Calendar;

/**
 * Created by CHEN on 2016/7/18.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    /**
     * 假如登陆成功到达一个系统展示页面
     * 登陆失败返回登陆页面并提示登陆失败
     * @param username 用户姓名
     * @param password 用户密码
     * @return 结果页面
     */
    @RequestMapping(value="/login",method= RequestMethod.POST)
    public String userLogin(@RequestParam("user_name") String username, @RequestParam("user_password") String password, HttpSession session, HttpServletResponse response) {
        String returnResult="/user/login";//返回的页面
        User user=userService.queryByPassword(username,password);//查找用户
        Cookie cookie;
        if(user!=null) {
            cookie=new Cookie("user_cookie_id", MyMD5.getMD5(user.getUsername(), ""+Calendar.YEAR+Calendar.MONTH+Calendar.WEEK_OF_YEAR));
            cookie.setMaxAge(3600*24);//保存一天
            cookie.setPath("/");
            response.addCookie(cookie);

            session.setAttribute("userStatus","login");
            session.setAttribute("user",user);//把整个user存到session中
            returnResult="/system/system_index";
         }
        return returnResult;
    }
}

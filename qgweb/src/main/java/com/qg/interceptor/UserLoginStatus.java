package com.qg.interceptor;

import com.qg.entity.User;
import com.qg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by CHEN on 2016/7/23.
 */
public class UserLoginStatus implements HandlerInterceptor{

    @Autowired
    private UserService userService;

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        httpServletRequest.setCharacterEncoding("utf-8");
        httpServletResponse.setCharacterEncoding("utf-8");
        httpServletResponse.setContentType("text/html;charset=utf-8");

        HttpSession session=httpServletRequest.getSession();
        if(session.getAttribute("userStatus") !=null) {
            //校验失败
            //从cookies中请求数据查看是否有此用户
            Cookie[] cookies=httpServletRequest.getCookies();
            for(Cookie cookie:cookies) {
                if ((cookie.getName().equals("user_cookie_id"))) {
                    User user=userService.queryByCookieId(cookie.getValue());
                    if (user != null) {
                        session.setAttribute("user",user);
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}

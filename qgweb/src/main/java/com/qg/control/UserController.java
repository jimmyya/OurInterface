package com.qg.control;

import com.qg.entity.User;
import com.qg.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.sun.xml.internal.ws.api.message.Packet.Status.Response;

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
     * @param model 传输
     * @return 结果页面
     */
    @RequestMapping(value="/login",method= RequestMethod.POST)
    public String userLogin(@RequestParam("user_name") String username, @RequestParam("user_password") String password, Model model) {
        System.out.println("执行登陆");
        String returnResult="/user/login";//返回的页面
        User user=userService.queryByPassword(username,password);//查找用户
        if(user!=null) {
            model.addAttribute("user",user);
            returnResult="/index";
         }
        return returnResult;
    }

}

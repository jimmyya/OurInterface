package com.qg.control;

import com.qg.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by CHEN on 2016/7/18.
 */

@Controller
@RequestMapping("/salt")
public class SaltController {

    @RequestMapping(value = "/login/get", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,String> getLoginSalt() {
        String salt = "#!32%#%^%4*3w5";
        Map<String,String> saltMap=new HashMap<String, String>();
        return saltMap;
    }

    /**
     * json获得的教学实例
     * @param users 用户对象
     * @return json信息
     */
    @RequestMapping(value = "saveUser", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,String> saveUser(@RequestBody List<User> users) {
        System.out.println("获得传值");
        for (User u : users)
            System.out.println(u);

        Map<String,String> map=new HashMap<String, String>();
        map.put("message","返回json");
        return map;
    }
}


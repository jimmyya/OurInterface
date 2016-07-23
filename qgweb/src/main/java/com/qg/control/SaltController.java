package com.qg.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
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
        saltMap.put("salt",salt);
        return saltMap;
    }
}


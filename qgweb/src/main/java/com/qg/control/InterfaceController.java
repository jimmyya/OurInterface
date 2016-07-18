package com.qg.control;

import com.qg.dto.Results;
import com.qg.entity.Interfaces;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by CHEN on 2016/7/18.
 */
@Controller
@RequestMapping("/interfaces")
public class InterfaceController {

    /**
     * 根据接口Id返回接口详情
     * @param interfaceId 接口Id
     * @return 接口的结果包 （status:400成功 505失败）
     * （Interfaces:interfaceId,name,url,format, requestMethod, powerLimit,
    author,description,requestResult）
     * （Message：附加信息）
     */
    @RequestMapping(value="/{interfaceId}/get",method= RequestMethod.GET)
    public Results<Interfaces> getInterfaceById(int interfaceId) {
        return null;
    }

    /**
     * 根据接口Id删除接口详情
     * @param interfaceId 接口Id
     * @return 接口的结果包 （status:400成功 505失败）
     * （System:null，判断返回status，成功则删除信息，失败填上原来的数据）
     * （Message：附加信息）
     */
    @RequestMapping(value="/{interfaceId}/delete",method= RequestMethod.GET)
    public Results<Interfaces> deleteInterfaceById(int interfaceId){
        return null;
    }

    /**
     * 根据 接口Id 修改接口
     * @param interfaceId 接口Id
     * @param name 接口名
     * @param url  接口路径
     * @param format 请求格式
     * @param requestMethod  请求方式
     * @param powerLimit  权限
     * @param author  作者
     * @param description  描述
     * @param requestResult  请求结果
     * @return 接口的结果包 （status:400成功 505失败）
     * （System:null，判断返回status，成功则把填入字符直接填上，失败填上原来的数据）
     * （Message：附加信息）
     */
    @RequestMapping(value="/modify",method= RequestMethod.POST)
    public Results<Interfaces> modifyInterfaceById(int interfaceId,String name,
           String url,String format, String requestMethod,String powerLimit,
            String author,String description,String requestResult){
        return null;
    }
}

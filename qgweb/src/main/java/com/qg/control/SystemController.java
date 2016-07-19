package com.qg.control;

import com.qg.dto.Results;
import com.qg.entity.Interfaces;
import com.qg.entity.Systems;
import com.qg.service.InterfaceService;
import com.qg.service.SystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/system")
public class SystemController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SystemService systemService;

    @Autowired
    private InterfaceService interfaceService;

    /**
     * 查询并返回所有的系统页面
     * @return 200 获得成功 500 服务器异常
     */
    @RequestMapping(value="/all",method= RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getAllSystem() {
        System.out.println("获得所有系统");
        Map<String,Object> systemMap=new HashMap<String, Object>();
        Results<List<Systems>> result=new Results<List<Systems>>();
        List<Systems> systemses=systemService.getAllSystems();//获得对象
        if(systemses!=null) {
            result.setStatus(200);
            result.setData(systemses);
        } else {
            result.setStatus(500);
        }
        systemMap.put("result",result);
        return systemMap;
    }

    /**
     * 返回系统详情页面
     * @param systemId  系统Id
     * @return 返回页面
     */
    @RequestMapping(value="/{systemId}/get",method=RequestMethod.GET)
    public String getSystemById(@PathVariable("systemId")int systemId) {
        String returnResult="";
        //获得所有的接口
        List<Interfaces> interfaceses=interfaceService.queryBySystemId(systemId);



        return returnResult;
    }


    public String insertSystem(String name,String description) {
        String resultReturn="";
        Systems systems=new Systems();
        return resultReturn;
    }


    /**
     * 修改系统的信息
     * @param systemId  系统Id
     * @param name  系统名
     * @param description  系统描述
     * @return  修改后的结果包（status:400成功 505失败）
     * （System:null，判断返回status，成功则把填入字符直接填上，失败填上原来的数据）
     * （Message：附加信息）
     */
    @RequestMapping(value="/modify",method= RequestMethod.POST)
    public Results<Systems> modifySystemById(int systemId, String name, String description) {
        return null;
    }

    /**
     * 通过系统的Id删除系统详情
     * @param systemId  系统Id
     * @return  删除后的结果包（status:400成功 505失败）
     * （System:null，判断返回status，成功则把详情删除，失败则则保留不动）
     * （Message：附加信息）
     */
    @RequestMapping(value="/{systemId}/delete",method= RequestMethod.GET)
    public Results<Systems> deleteSystemById(int systemId){
        return null;
    }
}

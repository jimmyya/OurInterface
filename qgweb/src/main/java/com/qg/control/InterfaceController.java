package com.qg.control;

import com.qg.dto.Message;
import com.qg.dto.Results;
import com.qg.dto.Status;
import com.qg.entity.Interfaces;
import com.qg.service.InterfaceService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import static javafx.scene.input.KeyCode.M;
import static javafx.scene.input.KeyCode.R;
import static javafx.scene.input.KeyCode.T;

/**
 * Created by CHEN on 2016/7/18.
 */
@Controller
@RequestMapping("/interfaces")
public class InterfaceController {

    @Autowired
    private InterfaceService interfaceService;

    /**
     * 根据接口Id返回接口详情
     * @param interfaceId 接口Id
     * @return 接口的结果包 （status:2000成功 505失败）
     * （Interfaces:interfaceId,name,url,format, requestMethod, powerLimit,
    author,description,requestResult）
     * （Message：附加信息）
     */
    @RequestMapping(value="/{interfaceId}",method= RequestMethod.GET)
    public Results<Interfaces> getInterfaceById(int interfaceId) {
        return null;
    }

    /**
     * 根据接口Id删除接口详情
     * @param interfaceId 接口Id
     * @return 接口的结果包 （status:2000成功 5000失败）
     * （System:null，判断返回status，成功则删除信息，失败填上原来的数据）
     * （Message：附加信息）
     */
    @RequestMapping(value="/{interfaceId}",method= RequestMethod.DELETE)
    public Map<String,Integer> deleteInterfaceById(@PathVariable("interfaceId") int interfaceId){
        Map<String,Integer> statusMap=new HashMap<String, Integer>();
        if(interfaceService.deleteInterfaceById(interfaceId)) {
           statusMap.put("status",Status.SUCCESS);
        } else {
           statusMap.put("status",Status.ERROR);
        }
        return statusMap;
    }

    @RequestMapping(value="/{interfaceId}",method=RequestMethod.PUT)
    public String modifyInterfaceById(@PathVariable("interfaceId") int interfaceId) {
        return "";
    }

    /**
     * 根据 接口Id 修改接口
     * @return 接口的结果包 （status:2000成功 5000失败）
     * （System:null，判断返回status，成功则把填入字符直接填上，失败填上原来的数据）
     * （Message：附加信息）
     */
    @RequestMapping(value="//modify",method= RequestMethod.POST)
    @ResponseBody
    public Map<String,Integer> modifyInterface(@RequestBody Interfaces interfaces){
        Map<String,Integer> statusMap=new HashMap<String, Integer>();
        if(interfaceService.modifyInterface(interfaces)) {
            statusMap.put("status", Status.SUCCESS);
        } else {
            statusMap.put("status",Status.ERROR);
        }
        return statusMap;
    }
}

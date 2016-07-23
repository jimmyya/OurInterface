package com.qg.control;

import com.qg.dto.Message;
import com.qg.dto.Results;
import com.qg.dto.Status;
import com.qg.entity.Interfaces;
import com.qg.entity.PowerLimit;
import com.qg.entity.Systems;
import com.qg.entity.User;
import com.qg.service.InterfaceService;
import com.qg.service.SystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javafx.scene.input.KeyCode.M;
import static javafx.scene.input.KeyCode.R;

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
     * 返回的结构
     * 结果result
     * ｛
     *      状态status:
     *      @see com.qg.dto.Status
     *      权限powerLimit:
     *      @see com.qg.entity.PowerLimit
     *      假如权限大于等于ALLER，则说明存在修改和新增，删除接口
     *      假如权限大于等于ADDER，则说明存在修改和新增接口
     *      数据data：
     *      listSystem
     *
     *      {
     *          @see com.qg.entity.Systems
     *      }
     * ｝
     * @return
     */
    @RequestMapping(value="/allsystem",method= RequestMethod.GET)
    @ResponseBody
    public Map<String, Results<List<Systems>>> getAllSystem(HttpSession session) {
        User user=(User)session.getAttribute("user");

        Map<String, Results<List<Systems>>> systemMap=new HashMap<String,  Results<List<Systems>>>();
        Results<List<Systems>> result=new Results<List<Systems>>();
        List<Systems> systemses=systemService.getAllSystems(user.getPowerLimit());//获得对象
        if(systemses!=null) {
            result.setPowerLimit(user.getPowerLimit());
            result.setStatus(Status.SUCCESS);
            result.setData(systemses);
        } else {
            result.setStatus(Status.USER_NO_FIND);
        }
        systemMap.put("result",result);
        return systemMap;
    }

    /**
     * 返回系统详情页面
     * @param systemId  系统Id
     * @return 返回页面
     */
/*    @RequestMapping(value="/{systemId}",method=RequestMethod.GET)
    public String getSystemById(@PathVariable("systemId")int systemId,HttpSession session) {
        session.setAttribute("systemId",systemId);
        return "/interface/interface_index";
    }*/
    @RequestMapping(value="/{systemId}",method=RequestMethod.GET)
    public String getSystemById(@PathVariable("systemId")int systemId) {
        return "/interface/interface_index";
    }


/*    @RequestMapping(value="/systemId",method=RequestMethod.GET)
    @ResponseBody
    public Map<String,Integer> getSystemId(HttpSession session) {
        Map<String,Integer> idMap=new HashMap<String, Integer>();
        idMap.put("systemId",(Integer)session.getAttribute("systemId"));
        return idMap;
    }*/

    /**
     *
     * @param systemId
     * @return
     */
    @RequestMapping(value="/{systemId}/all_interface",method=RequestMethod.GET)
    @ResponseBody
    public Map<String,Results<List<Interfaces>>> queryBySystemId(@PathVariable("systemId")int systemId) {
        Map<String,Results<List<Interfaces>>> listMap=new HashMap<String, Results<List<Interfaces>>>();
        Results<List<Interfaces>> listResults=new Results<List<Interfaces>>();
        //获得所有的接口名字和id和url
        List<Interfaces> interfaceList=interfaceService.queryBySystemId(systemId);
        if(interfaceList.size()>0) {
            listResults.setData(interfaceList);
            listResults.setStatus(Status.SUCCESS);
        } else {
            listResults.setStatus(Status.ERROR);
            listResults.setMessage("该系统尚未定制接口");
        }
        listMap.put("result",listResults);
        return listMap;
    }


    /**
     * 直接跳到新增页面
     * @return
     */
    @RequestMapping(value="/{uuid}/new_system",method=RequestMethod.GET)
    public String beforeInsertSystem() {
      return "/system/system_add";
    }


    /**
     * 增加一个系统
     * 返回结构
     * 响应码status：
     * @see com.qg.dto.Status
     * @return
     */
    @RequestMapping(value="/{uuid}/new_system",method=RequestMethod.POST)
    @ResponseBody
    public Map<String,Integer> insertSystem(@RequestBody Systems systems,HttpSession session) {
        User user=(User)session.getAttribute("user");
        Map<String,Integer> statusMap=new HashMap<String, Integer>();
        if(PowerLimit.ADDER<user.getPowerLimit()) {
            //权限允许
            if(systemService.insertSystem(systems)) {//插入成功
                statusMap.put("status",Status.SUCCESS);
            } else {
                statusMap.put("status",Status.ERROR);
            }
        } else {
            statusMap.put("status",Status.POWER_LIMIT);
        }
        return statusMap;
    }

    /**
     * 修改系统信息
     *
     * 返回的结构
     * @param system
     * @param session
     * @return
     */
    @RequestMapping(value="/{uuid}/{systemId}",method=RequestMethod.PUT)
    @ResponseBody
   public Map<String,Message> modifySystemById(@RequestBody Systems system, HttpSession session) {
        Map<String,Message> messageMap=new HashMap<String, Message>();
        Message message;
        //判断权限
        User user = (User)session.getAttribute("user");
        if(PowerLimit.ADDER<=user.getPowerLimit()) {
            //权限允许
            //在servlet层判断 哪一个是非空就修改哪个字段
            if(systemService.modifySystem(system)) {
                //成功修改
                message=new Message(Status.SUCCESS,"插入成功");
            } else {
                message=new Message(Status.ERROR,"修改数据失败");
            }
        } else {
            message=new Message(Status.POWER_LIMIT,"你没有该权限");
        }
        messageMap.put("message",message);
        return messageMap;
    }

    /**
     * 通过系统的Id删除系统详情
     * @param systemId  系统Id
     * @return  删除后的结果包
     * （Message：附加信息）
     */
    @RequestMapping(value="/{uuid}/{systemId}",method= RequestMethod.DELETE)
    public Map<String,Message> deleteSystemById(@PathVariable("systemId")int systemId,HttpSession session){
        Map<String,Message> messageMap=new HashMap<String,Message>();
        Message message;
        //判断权限
        User user = (User)session.getAttribute("user");
        if(PowerLimit.ALLER<=user.getPowerLimit()) {
            //权限允许
            if(systemService.deleteSystem(systemId)) {
                //成功删除
                message=new Message(Status.SUCCESS,"插入成功");
            } else {
                message=new Message(Status.ERROR,"修改数据失败");
            }
        } else {
            message=new Message(Status.POWER_LIMIT,"你没有该权限");
        }
        messageMap.put("message",message);
        return messageMap;
    }
}

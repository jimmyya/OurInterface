package com.qg.control;

import com.qg.dto.Message;
import com.qg.dto.Results;
import com.qg.dto.Status;
import com.qg.entity.Fields;
import com.qg.entity.Interfaces;
import com.qg.entity.PowerLimit;
import com.qg.entity.User;
import com.qg.service.FieldService;
import com.qg.service.InterfaceService;
import com.sun.corba.se.spi.orbutil.fsm.Guard;
import com.sun.deploy.nativesandbox.comm.Request;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import static javafx.scene.input.KeyCode.*;

/**
 * Created by CHEN on 2016/7/18.
 */
@Controller
@RequestMapping("/interfaces")
public class InterfaceController {

    @Autowired
    private InterfaceService interfaceService;

    @Autowired
    private FieldService fieldService;

    /**
     * 根据接口Id返回接口详情
     * @param interfaceId 接口Id
     * @return 接口的结果包
     * （Interfaces:interfaceId,name,url,format, requestMethod, powerLimit,
    author,description,requestResult）
     * （Message：附加信息）
     */
    @RequestMapping(value="/{interfaceId}/one",method= RequestMethod.GET)
    @ResponseBody
    public Map<String,Results> queryInterfaceById(@PathVariable("interfaceId") int interfaceId,HttpSession session) {
        Map<String,Results> interfaceMap=new HashMap<String, Results>();
        Results<Interfaces> interfaceResult= new Results<Interfaces>();
        Results<List<Fields>> fieldResult=new Results<List<Fields>>();
        List<Fields> fieldList;
        User user=(User)session.getAttribute("user");
        Interfaces interfaces=interfaceService.queryByInterfaceId(interfaceId,user.getPowerLimit());

        if(interfaces==null) {
            interfaceResult.setStatus(Status.ERROR);
            interfaceResult.setMessage("该接口不存在");
        } else {
            interfaceResult.setPowerLimit(user.getPowerLimit());
            interfaceResult.setStatus(Status.SUCCESS);
            interfaceResult.setData(interfaces);
            //返回字段信息
            fieldList=fieldService.queryByInterfaceId(interfaceId,user.getPowerLimit());
            if(null==fieldList||fieldList.size()==0) {
                fieldResult.setStatus(Status.ERROR);
                fieldResult.setMessage("字段为空");
            } else {
                fieldResult.setPowerLimit(user.getPowerLimit());
                fieldResult.setData(fieldList);
                fieldResult.setStatus(Status.SUCCESS);
            }
            fieldResult.setData(fieldList);

        }
        interfaceMap.put("interfaceResult",interfaceResult);
        interfaceMap.put("fieldResult",fieldResult);
        return interfaceMap;
    }

    /**
     * 根据接口Id删除接口详情
     * @param interfaceId 接口Id
     * @return 接口的结果包
     * （System:null，判断返回status，成功则删除信息，失败填上原来的数据）
     * （Message：附加信息）
     */
    @RequestMapping(value="/{uuid}/{interfaceId}",method= RequestMethod.DELETE)
    public Map<String,Integer> deleteInterfaceById(@PathVariable("interfaceId") int interfaceId,HttpSession session){
        Map<String,Integer> statusMap=new HashMap<String, Integer>();
        User user=(User)session.getAttribute("user");
        if(PowerLimit.ALLER<=user.getPowerLimit()) {
            if(interfaceService.deleteInterfaceById(interfaceId)) {
                statusMap.put("status",Status.SUCCESS);
            } else {
                statusMap.put("status",Status.ERROR);
            }
        }else {
            statusMap.put("status",Status.POWER_LIMIT);
        }
        return statusMap;
    }

    /**
     *
     * @param interfaceId
     * @return
     */
    @RequestMapping(value="/{uuid}/{interfaceId}",method=RequestMethod.GET)
 /*   public String modifyInterfaceById(@PathVariable("interfaceId") int interfaceId,HttpSession session) {
        session.setAttribute("interfaceId",interfaceId);
        return "/interface/interface_modify";
    }*/
    public String modifyInterfaceById(@PathVariable("interfaceId") int interfaceId) {
        return "/interface/interface_modify";
    }

/*    @RequestMapping(value="/interfaceId",method=RequestMethod.GET)
    @ResponseBody
    public Map<String,Integer> getInterfaceId(HttpSession session) {
        Map<String,Integer> idMap=new HashMap<String, Integer>();
        idMap.put("interfaceId",(Integer)session.getAttribute("interfaceId"));
        return idMap;
    }*/

    /**
     * 根据 接口Id 修改接口
     * @return 接口的结果包 （status:2000成功 5000失败）
     * （System:null，判断返回status，成功则把填入字符直接填上，失败填上原来的数据）
     * （Message：附加信息）
     */
    @RequestMapping(value="/{uuid}/modify",method= RequestMethod.POST)
    @ResponseBody
    public Map<String,Message> modifyInterface(@RequestBody Interfaces interfaces,HttpSession session) {
        Map<String,Message> messageMap=new HashMap<String, Message>();
        Message message;
        User user=(User)session.getAttribute("user");
        if(PowerLimit.ADDER<=user.getPowerLimit()) {
            //权限允许
            if(interfaceService.modifyInterface(interfaces)) {
                message=new Message(Status.SUCCESS);
            } else {
                message=new Message(Status.ERROR,"更新数据失败");
            }
        }else {
            message=new Message(Status.POWER_LIMIT,"权限不足");
        }
        messageMap.put("message",message);
        return messageMap;
    }
}

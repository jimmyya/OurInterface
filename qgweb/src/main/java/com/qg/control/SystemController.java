package com.qg.control;

import com.qg.dto.Results;
import com.qg.entity.Systems;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static javafx.scene.input.KeyCode.R;

/**
 * Created by CHEN on 2016/7/18.
 */

@Controller
@RequestMapping("/system")
public class SystemController {

    /**
     * 查询并返回所有的系统页面
     * @return 返回页面
     */
    @RequestMapping(value="/getAll",method= RequestMethod.GET)
    public String getAllSystem() {
        String returnResult="";
        return returnResult;
    }

    /**
     * 返回系统详情页面
     * @param systemId  系统Id
     * @return 返回页面
     */
    @RequestMapping(value="/{systemId}/get",method=RequestMethod.GET)
    public String getSystemById(int systemId) {
        String returnResult="";
        return returnResult;
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

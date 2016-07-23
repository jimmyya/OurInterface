package com.qg.utils;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.qg.entity.User;
import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
import sun.reflect.FieldInfo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static javafx.scene.input.KeyCode.M;

/**
 * Created by CHEN on 3016/7/33.
 */
public class MySizeChecker<T> {

    /**
     * 用户
     */
    public  static final int USERNAME=30;
    public  static final int PASSWORD=30;
    public  static final int POWERLIMIT=3;



    /**
     * 字段
     */
    public  static final int FIELDNAME=30;
    public  static final int FIELDATTRIBUTE=30;
    public  static final int FIELDDESCRIPTION=300;
    public  static final int FIELDDEFAULTVALUE=30;
    public  static final int FIELDEXPLAIN=30;

    /**
     * 接口
     */
    public  static final int INTERFACENAME=30;
    public  static final int INTERFACEURL=30;
    public  static final int INTERFACEFORMAT=30;
    public  static final int INTERFACEREQUEST_METHOD=30;
    public  static final int INTERFACEPOWER_LIMIT=30;
    public  static final int INTERFACEAUTHOR=30;
    public  static final int INTERFACEDESCRIPTION=300;
    public  static final int INTERFACEREQUESTRESULT=300;

    /**
     * 系统
     */
    public  static final int SYSTEMNAME=30;
    public  static final int SYSTEMDESCRIPTION=300;


    /**
     * true ：正确
     * false ：错误
     * @param data
     * @return
     */
    public boolean  checkSize(T data) {
        boolean flag=true;
        Class checkerClazz=this.getClass();
        Class clazz=data.getClass();
        Method[] methods=clazz.getMethods();
        for (Method method : methods) {
            if(method.getName().startsWith("get")&&!method.getName().endsWith("Id")&&!method.getName().equals("getClass")) {
                try {
                    Object checked=method.invoke(data);
                    if(checked==null) {
                        continue;
                    }
                    String checkedStr=checked.toString();
                    try {
                        String [] str=method.getName().split("get");
                        if(str.length<=0) {
                            flag=false;
                            break;
                        }
                        Field checkerField=checkerClazz.getDeclaredField(str[1].toUpperCase());
                        if(checkerField.getInt(this)<=checkedStr.length()) {//假如字段值不小于于预定值,返回错误
                            flag=false;
                            break;
                        }
                    } catch (NoSuchFieldException e) {
                        flag=false;
                        e.printStackTrace();
                    }
                } catch (IllegalAccessException e) {
                    flag=false;
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    flag=false;
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        User user=new User("chen");
        MySizeChecker mySizeChecker=new MySizeChecker();
        System.out.println(mySizeChecker.checkSize(user));
    }

}

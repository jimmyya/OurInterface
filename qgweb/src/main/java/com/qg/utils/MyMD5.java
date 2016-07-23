package com.qg.utils;

import org.springframework.util.DigestUtils;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by CHEN on 2016/7/18.
 */
public class MyMD5 {
    private final static String salt="17^#$%^63%$^a1!$81!$492&(&147";

    /**
     * 根据value生成md5的值
     * @param value ：传参
     * @return md5的值
     */
    public static String getMD5(String value) {
        String base=value+salt;
        String md5= DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }

    /**
     * 根据value1和value2生成md5的值
     * @param value1 ：参数1
     * @param value2 ：参数2
     * @return
     */
    public static String getMD5(String value1,String value2) {
        String base=value1+"salt"+value2;
        String md5=DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }


}

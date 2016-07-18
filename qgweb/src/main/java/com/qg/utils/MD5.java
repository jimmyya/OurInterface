package com.qg.utils;

import org.springframework.util.DigestUtils;

/**
 * Created by CHEN on 2016/7/18.
 */
public class MD5 {
    private final static String salt="17^#$%^63%$^a1!$81!$492&(&147";

    /**
     * 根据value生成md5的值
     * @param value ：传参
     * @return md5的值
     */
    public static String getMD5(String value) {
        String base=value+"/"+salt;
        String md5= DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }

}

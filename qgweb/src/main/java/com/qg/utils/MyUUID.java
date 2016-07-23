package com.qg.utils;

import java.util.UUID;

/**
 * Created by CHEN on 2016/7/23.
 */
public class MyUUID {
    private static String UUID_CODE= UUID.randomUUID().toString();
    private static String UUID_CODE2=UUID.randomUUID().toString();
    public static String getCode() {
        return UUID_CODE;
    }
    public static String getCode2() {return UUID_CODE2;}
}

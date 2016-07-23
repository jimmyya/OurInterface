package com.qg.utils;

import java.util.Random;
import java.util.UUID;

/**
 * Created by CHEN on 2016/7/23.
 */
public class MyUUID {
    private static Random random= new Random();
    private static int UUID_CODE= random.nextInt(10000);
    private static int UUID_CODE2= random.nextInt(10000);
    public static int getCode() {
        return UUID_CODE;
    }
    public static int getCode2() {return UUID_CODE2;}
}

package com.qg.test;

import org.springframework.util.DigestUtils;

import java.util.Calendar;

/**
 * Created by CHEN on 2016/7/17.
 */
public class Hello {
    public static void main(String[] args) {//psvm
        System.out.println(DigestUtils.md5DigestAsHex("123456".getBytes()));
    }
}

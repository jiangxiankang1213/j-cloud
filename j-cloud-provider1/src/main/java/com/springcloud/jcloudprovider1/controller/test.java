package com.springcloud.jcloudprovider1.controller;

import java.util.HashMap;
import java.util.logging.Handler;

/**
 * @USER: Jiang-XK
 * @DESCRIPTION:
 * @DATE: 2021/1/29 16:14
 * @param:
 */
public class test {
    public static void main(String[] args) {
        //String ab="a";
       //String ab="a";
        String ab = new String("key");
        HashMap<String,String> a= new HashMap<>();
        String s = a.put(ab, "测试");
        a.put(ab,"测试111");
        System.out.println(s);

        System.out.println("测试冲突解决");
        System.out.println("测试冲突解决jxk3");
        System.out.println("测试冲突解决jxk2");
        ////////////////////////////////////
        System.out.println("测试冲突解决jxk3333);
        System.out.println("测试冲突解决jxk22222");
    }
}

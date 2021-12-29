package com.springcloud.jcloudprovider1.controller;

import java.util.*;
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

        System.out.println("测试冲突解决jxk22222");

        System.out.println("测试冲突解决jxk22222");

        System.out.println("测试冲突解决jxk3333");
        List<Map> dd =new ArrayList<>();
        List<Animal> dd2 =new ArrayList<>();
        int a2=Integer.MAX_VALUE;//2147483647
        int newCapacity = 10 + (10 >> 1);
        System.out.println("====================:"+newCapacity);
        Map a7 =new HashMap();
        Map b =new Hashtable();

    }
}

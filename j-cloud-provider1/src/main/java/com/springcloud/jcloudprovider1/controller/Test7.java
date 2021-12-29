package com.springcloud.jcloudprovider1.controller;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: j-cloud
 * @ClassName Test7
 * @description:
 * @author: shenlan
 * @create: 2021-12-28 18:24
 * @Version 1.0
 **/

public class Test7 {
    /**
    * @Description:
    * @Param: 
    * @return: 
    * @Author: jxk
    * @Date: 2021/12/29
    */
    public static String heh (Object o,DogPro... d){
        Map a =new HashMap<>();
        a.put(o,d);
        String s = JSON.toJSONString(a);
        System.out.println(s);
        return s;
    }
    
}

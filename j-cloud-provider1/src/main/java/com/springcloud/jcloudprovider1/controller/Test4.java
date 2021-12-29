package com.springcloud.jcloudprovider1.controller;




import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test4 {
    public static String heh (Object o,DogPro... d){
        Map a =new HashMap<>();
        a.put(o,d);
        String s = JSON.toJSONString(a);
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        DogPro[] a =new DogPro[1];
        DogPro c =new DogPro();
        c.setDrink("喝可乐");
        c.setEat("吃辣条");
        a[0]=c;

        heh(1,a);
    }
}

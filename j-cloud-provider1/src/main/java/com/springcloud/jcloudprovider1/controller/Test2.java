package com.springcloud.jcloudprovider1.controller;

public class Test2 {
    static {
        System.out.println("222");
    }
    static {
        System.out.println("111");
    }
    {
        System.out.println("I'm A construct code block");
    }
    public static void main(String[] args) {
        System.out.println("hahahh");
    }

}

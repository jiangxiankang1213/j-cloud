package com.springcloud.jcloudprovider1.controller;

public class Animal {
    private String hou;
    private String jiao;

    public String getHou() {
        return hou;
    }

    public void setHou(String hou) {
        this.hou = hou;
    }

    public String getJiao() {
        return jiao;
    }

    public void setJiao(String jiao) {
        this.jiao = jiao;
    }

    public void eat(){
        System.out.println("吃饭");
    }
    public void drink(){
        System.out.println("喝水");
    }
}

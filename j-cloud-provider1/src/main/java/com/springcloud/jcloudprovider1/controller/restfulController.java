package com.springcloud.jcloudprovider1.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/v1")
public class restfulController {

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public String getCompanyProductInfo() {
        return "I`m restful  ,POST!";
    }
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public String getCompanyProductInfo2() {
        return "I`m restful  ,GET!";
    }
}

package com.springcloud.jcloudprovider1.controller;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) {
        String str= "2023-12-31";
        SimpleDateFormat ps = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {

            date= ps.parse(str);
            SimpleDateFormat ps2 = new SimpleDateFormat("YYYY-MM-dd");
            System.out.println(ps.format(date));
            System.out.println(ps2.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}

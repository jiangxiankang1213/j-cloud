package com.springcloud.jcloudprovider1.controller;

import java.io.Serializable;

public class DogPro implements Serializable {
    String eat;
    String drink;

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}

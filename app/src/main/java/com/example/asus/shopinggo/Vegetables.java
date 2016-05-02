package com.example.asus.shopinggo;

import java.io.Serializable;

/**
 * Created by Asus on 2016/4/27.
 */
public class Vegetables implements Serializable{
    private int image;
    private String name;
    private double price;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Vegetables(int image, String name, double price) {
        this.image = image;
        this.name = name;
        this.price = price;
    }
}

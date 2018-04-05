package com.example.lenovo.myapplication;

/**
 * Created by kensi on 22/03/2018.
 */

public class Category {
    private String name;
    private int image;

    public Category() {}
    public Category(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

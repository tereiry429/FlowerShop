package com.teresa.android.flowershop;

public class CategoryItem {
    String name;
    int image;
    String description;

    public CategoryItem(String name, int image) {
        this.name = name;
        this.image = image;
    }
    public String getName(){
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
}
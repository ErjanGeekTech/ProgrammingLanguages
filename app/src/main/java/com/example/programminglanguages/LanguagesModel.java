package com.example.programminglanguages;

import java.util.List;

public class LanguagesModel {

    String name;
    String description;
    Integer image;

    public LanguagesModel(String name,  Integer image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}

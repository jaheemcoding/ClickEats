package com.example.oneclickeats.models;

public class DetailMenuModel {

    int image;
    String name;
    String desciption;
    String rating;
    String price;
    String timing;


    public DetailMenuModel(int image, String name, String desciption, String rating, String price, String timing) {
        this.image = image;
        this.name = name;
        this.desciption = desciption;
        this.rating = rating;
        this.price = price;
        this.timing = timing;
    }
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

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }
}

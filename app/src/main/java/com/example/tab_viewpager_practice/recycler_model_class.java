package com.example.tab_viewpager_practice;

public class recycler_model_class {

    private String title;
    private String description;
    private double rating;
    private  double price;
    private int img;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public recycler_model_class(String title, String description, double rating, double price, int img) {
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.price = price;
        this.img = img;
    }
}

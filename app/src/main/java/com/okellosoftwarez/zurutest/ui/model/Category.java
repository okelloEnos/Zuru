package com.okellosoftwarez.zurutest.ui.model;

public class Category {
    private String name;
    private String image;
    private String driverType;
    private String price;
    private String area;

    public Category(String name, String image, String driverType, String price, String area) {
        this.name = name;
        this.image = image;
        this.driverType = driverType;
        this.price = price;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDriverType() {
        return driverType;
    }

    public void setDriverType(String driverType) {
        this.driverType = driverType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}

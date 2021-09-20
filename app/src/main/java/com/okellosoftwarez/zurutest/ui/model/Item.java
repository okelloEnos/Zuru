package com.okellosoftwarez.zurutest.ui.model;

import java.util.List;

public class Item {
    private String title;
    private List<Category> categoryList;

    public Item(String title, List<Category> categoryList) {
        this.title = title;
        this.categoryList = categoryList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }
}

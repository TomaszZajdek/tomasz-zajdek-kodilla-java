package com.kodilla.good.patterns.challenges.food;


import java.util.ArrayList;

public class Order {
    private String shopName;
    private ArrayList<Product> products;

    public String getShopName() {
        return shopName;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Order(String shopName, ArrayList<Product> products) {
        this.shopName = shopName;
        this.products = products;
    }
}

package com.kodilla.good.patterns.challenges;
public class Product {
    private String ID;
    private String name;
    private String price;
    private boolean available;

    public Product(String ID, String name, String price, boolean available) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }
}

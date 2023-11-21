package com.kodilla.good.patterns.challenges.food;

public class GlutenFreeShop implements Processor {
    private Product product;

    public GlutenFreeShop(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public boolean process( Order order) {
        return order.getShopName().contains("GlutenFreeShop");
    }
}

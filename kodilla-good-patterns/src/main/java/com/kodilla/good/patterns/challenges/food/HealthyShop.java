package com.kodilla.good.patterns.challenges.food;

public class HealthyShop  implements Processor {
    private Product product;

    public HealthyShop(Product product) {
        this.product = product;
    }

    @Override
    public boolean process(Order order) {
        return order.getShopName().contains("HealthyShop");
    }
}

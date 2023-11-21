package com.kodilla.good.patterns.challenges.food;

public class ExtraFoodShop  implements Processor {
    private Product product;

    public ExtraFoodShop(Product product) {
        this.product = product;
    }

    @Override
    public boolean process(Order order) {
        if(order.getShopName().contains("ExtraFoodShop")) {
            return true;
        }
        return true;
    }
}

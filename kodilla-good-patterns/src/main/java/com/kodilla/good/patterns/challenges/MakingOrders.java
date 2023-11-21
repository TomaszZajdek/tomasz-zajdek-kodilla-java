package com.kodilla.good.patterns.challenges;
public class MakingOrders implements OrderService {
    @Override
    public boolean order(Product product, User user) {
        if(product.isAvailable()) {
            return true;
        }
        return false;
    }
}

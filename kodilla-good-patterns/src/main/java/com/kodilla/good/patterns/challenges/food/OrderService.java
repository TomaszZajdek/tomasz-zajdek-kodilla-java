package com.kodilla.good.patterns.challenges.food;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.Map;

public class OrderService {
    private Map<String, Processor> processors;

    public OrderService() {
        processors = new HashMap<>();
        processors.put("ExtraFoodShop", new ExtraFoodShop(new Product("1", "Fasola", "10.00", true)));
        processors.put("HealthyShop", new HealthyShop(new Product("2", "Marchewka", "00.10", true)));
        processors.put("GlutenFreeShop", new GlutenFreeShop(new Product("3", "Koperek", "190.11", false)));
    }
    public boolean orderProduct(Order order) {
        Processor shop = processors.get(order.getShopName());
        if(shop != null) {
            return shop.process(order);
        } else {
            throw new RuntimeException("Error, incorrect shop name");
        }
    }
}

package com.kodilla.good.patterns.challenges.food;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Food2DoorApp {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        Product product = new Product("123", "Ziemniaki", "11.11", true);
        ArrayList<Product> products = new ArrayList<>();
        products.add(product);
        Order orderForExtraFoodShop = new Order("ExtraFoodShop", products);

        try {
            boolean isOrderSuccessful = orderService.orderProduct(orderForExtraFoodShop);
            if (isOrderSuccessful) {
                System.out.println("Order placed successfully.");
            } else {
                System.out.println("Order could not be processed.");
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
}
}

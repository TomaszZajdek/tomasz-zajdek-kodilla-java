package com.kodilla.good.patterns.challenges;
public class OrdersToDo implements OrderRepository {
    @Override
    public void createOrder(User user, Product product) {
        System.out.println(user.getName() + " " + product );
    }
}

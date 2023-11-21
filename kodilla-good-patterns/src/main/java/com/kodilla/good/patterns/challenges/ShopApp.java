package com.kodilla.good.patterns.challenges;

public class ShopApp {
    static public void main(String[] args) {
        User user = new User("Jan");
        Product product = new Product("0001", "Table for kids", "10.00", true );

        ProductOrderService POS = new ProductOrderService(new UserInfromationService(), new MakingOrders(), new OrdersToDo());

        ProductOrderDto productOrderDto = POS.processOrder(new OrderRequest(user, product));

    }
}

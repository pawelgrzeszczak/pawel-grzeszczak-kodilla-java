package com.kodilla.good.patterns.food2door.fooddistributors;

import com.kodilla.good.patterns.food2door.OrderRequest;

public class ExtraFoodShop implements FoodDistributors {
    private String name = "ExtraFoodShop";

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Zamówienie od: " + name);
        System.out.println(orderRequest.getUser().getName() + " " + orderRequest.getUser().getSurname() + " zamówiłeś: x"
        + orderRequest.getProduct().getQuantity() + " " + orderRequest.getProduct().getProductName() + "\n");
    }
}

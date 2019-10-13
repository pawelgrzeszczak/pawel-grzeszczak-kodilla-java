package com.kodilla.good.patterns.Food2Door.FoodDistributors;

import com.kodilla.good.patterns.Food2Door.OrderRequest;

public class ExtraFoodShop implements FoodDistributors {
    private String name = "ExtraFoodShop";

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Zamówienie od: " + name);
        System.out.println(orderRequest.getUser().getName() + " " + orderRequest.getUser().getSurname() + " zamówiłeś: x"
        + orderRequest.getProduct().getQuantity() + " " + orderRequest.getProduct().getProductName() + "\n");
    }
}

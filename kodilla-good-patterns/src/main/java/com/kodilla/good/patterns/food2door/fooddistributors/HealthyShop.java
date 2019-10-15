package com.kodilla.good.patterns.food2door.fooddistributors;

import com.kodilla.good.patterns.food2door.OrderRequest;

public class HealthyShop implements FoodDistributors {
    private String name = "HealthyShop";

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println(name + " dziękuje za zakupy");
        System.out.println(orderRequest.getUser().getName() + " " + orderRequest.getUser().getSurname() + " zamówiłeś: x"
                + orderRequest.getProduct().getQuantity() + " " + orderRequest.getProduct().getProductName() + "\n");
    }
}

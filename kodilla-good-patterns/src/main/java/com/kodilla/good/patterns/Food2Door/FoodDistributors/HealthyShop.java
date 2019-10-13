package com.kodilla.good.patterns.Food2Door.FoodDistributors;

import com.kodilla.good.patterns.Food2Door.OrderRequest;

public class HealthyShop implements FoodDistributors {
    private String name;

    public HealthyShop(String name) {
        this.name = name;
    }

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println(name + " dziękuje za zakupy");
        System.out.println(orderRequest.getUser().getName() + orderRequest.getUser().getSurname() + " zamówiłeś: x"
                + orderRequest.getProduct().getQuantity() + " " + orderRequest.getProduct().getProductName());
    }
}

package com.kodilla.good.patterns.Food2Door.FoodDistributors;

import com.kodilla.good.patterns.Food2Door.OrderRequest;

public class GlutenFreeShop implements FoodDistributors {
    private String name = "GlutenFreeShop";

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Produkty od: " + name + " zostaną wysłane");
        System.out.println(orderRequest.getUser().getName() + " " + orderRequest.getUser().getSurname() + " zamówiłeś: x"
                + orderRequest.getProduct().getQuantity() + " " + orderRequest.getProduct().getProductName() + "\n");
    }
}

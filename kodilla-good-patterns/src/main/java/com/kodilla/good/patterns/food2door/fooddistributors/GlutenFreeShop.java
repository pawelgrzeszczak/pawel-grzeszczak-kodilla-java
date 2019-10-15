package com.kodilla.good.patterns.food2door.fooddistributors;

import com.kodilla.good.patterns.food2door.OrderRequest;

public class GlutenFreeShop implements FoodDistributors {
    private String name = "GlutenFreeShop";

    @Override
    public void process(OrderRequest orderRequest) {
        System.out.println("Produkty od: " + name + " zostaną wysłane");
        System.out.println(orderRequest.getUser().getName() + " " + orderRequest.getUser().getSurname() + " zamówiłeś: x"
                + orderRequest.getProduct().getQuantity() + " " + orderRequest.getProduct().getProductName() + "\n");
    }
}

package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.fooddistributors.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.fooddistributors.FoodDistributors;

public class FoodOrderProcessor {

    public void process(OrderRequest orderRequest) {
        getDistributor(orderRequest).process(orderRequest);
    }

    public FoodDistributors getDistributor(OrderRequest orderRequest) {
        if (orderRequest.getDistributor().equals("ExtraFoodShop")) {
            ExtraFoodShop extraFoodShop = new ExtraFoodShop();
            return extraFoodShop;
        }
        if (orderRequest.getDistributor().equals("GlutenFreeShop")) {
            ExtraFoodShop extraFoodShop = new ExtraFoodShop();
            return extraFoodShop;
        }
        if (orderRequest.getDistributor().equals("HealthyShop")) {
            ExtraFoodShop extraFoodShop = new ExtraFoodShop();
            return extraFoodShop;
        }
        return null;
    }
}



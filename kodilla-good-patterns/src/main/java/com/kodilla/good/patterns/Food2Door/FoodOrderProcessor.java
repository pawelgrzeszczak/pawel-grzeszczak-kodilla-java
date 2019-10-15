package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.FoodDistributors.ExtraFoodShop;
import com.kodilla.good.patterns.Food2Door.FoodDistributors.FoodDistributors;

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



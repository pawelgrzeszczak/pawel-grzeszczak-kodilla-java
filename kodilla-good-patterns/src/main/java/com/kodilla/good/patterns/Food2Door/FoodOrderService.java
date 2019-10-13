package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.FoodDistributors.ExtraFoodShop;
import com.kodilla.good.patterns.Food2Door.FoodDistributors.FoodDistributors;

public class FoodOrderService {

    public void process(OrderRequest orderRequest) {
        getDistributor(orderRequest).process(orderRequest);
    }

    public FoodDistributors getDistributor(OrderRequest orderRequest) {
        if (orderRequest.getDistributor() == "ExtraFoodShop") {
            ExtraFoodShop extraFoodShop = new ExtraFoodShop();
            return extraFoodShop;
        }
        if (orderRequest.getDistributor() == "GlutenFreeShop") {
            ExtraFoodShop extraFoodShop = new ExtraFoodShop();
            return extraFoodShop;
        }
        if (orderRequest.getDistributor() == "HealthyShop") {
            ExtraFoodShop extraFoodShop = new ExtraFoodShop();
            return extraFoodShop;
        }
        return null;
    }
}



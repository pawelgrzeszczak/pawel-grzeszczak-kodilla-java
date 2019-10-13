package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.FoodDistributors.ExtraFoodShop;
import com.kodilla.good.patterns.Food2Door.FoodDistributors.GlutenFreeShop;
import com.kodilla.good.patterns.Food2Door.FoodDistributors.HealthyShop;

public class Application {
    public static void main(String[] args) {
        SampleOrder sampleOrder = new SampleOrder();
        OrderRequest orderRequest = sampleOrder.createSampleOrder();

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        extraFoodShop.process(orderRequest);
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        glutenFreeShop.process(orderRequest);
        HealthyShop healthyShop = new HealthyShop();
        healthyShop.process(orderRequest);
    }
}



//    SampleOrder sampleOrder = new SampleOrder();
//    OrderRequest orderRequest = sampleOrder.createSampleOrder();
//
//    ProductOrderService productOrderService = new ProductOrderService(
//            new MailService(), new ItemOrderService(), new ItemOrderRepository());
//        productOrderService.process(orderRequest);
//                }
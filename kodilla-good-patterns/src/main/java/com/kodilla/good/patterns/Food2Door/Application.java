package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.FoodDistributors.FoodDistributors;

public class Application {
    public static void main(String[] args) {
        SampleOrder sampleOrder = new SampleOrder();
        OrderRequest orderRequest = sampleOrder.createSampleOrder();

        FoodOrderService foodOrderService = new FoodOrderService(new FoodDistributors());
        //foodOrderService.
    }
}



//    SampleOrder sampleOrder = new SampleOrder();
//    OrderRequest orderRequest = sampleOrder.createSampleOrder();
//
//    ProductOrderService productOrderService = new ProductOrderService(
//            new MailService(), new ItemOrderService(), new ItemOrderRepository());
//        productOrderService.process(orderRequest);
//                }
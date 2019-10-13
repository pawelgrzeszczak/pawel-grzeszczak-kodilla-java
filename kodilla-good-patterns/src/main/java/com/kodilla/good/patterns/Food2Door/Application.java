package com.kodilla.good.patterns.Food2Door;

public class Application {
    public static void main(String[] args) {
        SampleOrder sampleOrder = new SampleOrder();
        OrderRequest orderRequest = sampleOrder.createSampleOrder();

        FoodOrderService foodOrderService = new FoodOrderService();
        foodOrderService.process(orderRequest);
    }
}

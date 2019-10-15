package com.kodilla.good.patterns.Food2Door;

public class Application {
    public static void main(String[] args) {
        SampleOrder sampleOrder = new SampleOrder();
        OrderRequest orderRequest = sampleOrder.createSampleOrder();

        FoodOrderProcessor foodOrderProcessor = new FoodOrderProcessor();
        foodOrderProcessor.process(orderRequest);
    }
}

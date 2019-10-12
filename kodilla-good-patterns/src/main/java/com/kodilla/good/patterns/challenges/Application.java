package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        SampleOrder sampleOrder = new SampleOrder();
        OrderRequest orderRequest = sampleOrder.createSampleOrder();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new ItemOrderService(), new ItemOrderRepository());
        productOrderService.process(orderRequest);
    }
}

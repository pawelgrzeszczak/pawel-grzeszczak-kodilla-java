package com.kodilla.good.patterns.Food2Door;

public class FoodOrderService {

        public void process(OrderRequest orderRequest) {
            orderRequest.getDistributor().process(orderRequest);
        }
}



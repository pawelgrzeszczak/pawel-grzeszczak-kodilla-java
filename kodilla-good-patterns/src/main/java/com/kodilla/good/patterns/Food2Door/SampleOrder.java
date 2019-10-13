package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.FoodDistributors.ExtraFoodShop;

import java.time.LocalDateTime;

public class SampleOrder {
    public OrderRequest createSampleOrder() {

        User sampleUser = new User("Paweł", "Grzeszczak", "Kielce, ul. Warszawska 6", "name@example.com");

        Product sampleProduct1 = new Product("Mleko", 1.60, 2);
//        Product sampleProduct2 = new Product("Ser", 4.60, 1);
//        Product sampleProduct3 = new Product("Masło", 4.99, 1);
//        Product sampleProduct4 = new Product("Kefir", 6.60, 5);
//        Product sampleProduct5 = new Product("Jogurt", 3.60, 2);

        LocalDateTime sampleOrderDate = LocalDateTime.now();

        String distributor = "ExtraFoodShop";

//          ExtraFoodShop distributor = new ExtraFoodShop();
//        GlutenFreeShop distributor = new GlutenFreeShop();
//        HealthyShop distributor = new HealthyShop();

        return new OrderRequest(sampleUser, sampleProduct1, sampleOrderDate, distributor);
    }
}

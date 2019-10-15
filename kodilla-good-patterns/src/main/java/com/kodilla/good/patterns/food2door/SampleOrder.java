package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class SampleOrder {
    public OrderRequest createSampleOrder() {

        User sampleUser = new User("Paweł", "Grzeszczak", "Kielce, ul. Warszawska 6", "name@example.com");
        Product sampleProduct1 = new Product("Mleko", 1.60, 2);
        LocalDateTime sampleOrderDate = LocalDateTime.now();
        String distributor = "ExtraFoodShop";

        return new OrderRequest(sampleUser, sampleProduct1, sampleOrderDate, distributor);
    }
}

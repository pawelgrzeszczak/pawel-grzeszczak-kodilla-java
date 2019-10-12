package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SampleOrder {
    public OrderRequest createSampleOrder() {
        User sampleUser = new User("Paweł", "Grzeszczak", "mail@example.com");
        Product sampleProduct = new Product("kapcie");
        LocalDateTime sampleOrderDate = LocalDateTime.now();

        return new OrderRequest(sampleUser, sampleProduct, sampleOrderDate);
    }
}

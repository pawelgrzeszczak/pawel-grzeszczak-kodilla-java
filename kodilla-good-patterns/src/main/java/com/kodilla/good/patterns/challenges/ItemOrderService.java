package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ItemOrderService implements OrderService {
    @Override
    public boolean order(final User user, final Product product, final LocalDateTime orderTime) {
        System.out.println("Purchased by: " + user.getName() + " " + user.getSurname() + " on " + orderTime
                + "\n" + "Ordered product: " + product.getProductName());
        return true;
    }

}

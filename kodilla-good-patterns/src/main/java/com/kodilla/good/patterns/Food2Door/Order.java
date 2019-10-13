package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDateTime;

public class Order {
    private User user;
    private Product product;
    private LocalDateTime orderDate;

    public Order(User user, Product product, LocalDateTime orderDate) {
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}

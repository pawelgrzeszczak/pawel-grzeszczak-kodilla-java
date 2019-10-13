package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.FoodDistributors.FoodDistributors;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private Product product;
    private LocalDateTime orderDate;
    private String distributor;

    public OrderRequest(User user, Product product, LocalDateTime orderDate, String distributor) {
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
        this.distributor = distributor;
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

    public String getDistributor() {
        return distributor;
    }
}


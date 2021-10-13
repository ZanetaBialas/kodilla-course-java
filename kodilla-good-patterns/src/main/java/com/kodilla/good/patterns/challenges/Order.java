package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Order {
    private final User user;
    private final Product product;
    private LocalDateTime orderDate;

    public Order(final User user, final Product product, final LocalDateTime orderDate) {
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

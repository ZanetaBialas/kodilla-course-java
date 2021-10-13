package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderService {
    private User user;
    private Product product;
    private LocalDateTime dateTime;

    boolean createOrder(User user, Product product, LocalDateTime dateTime){
        this.user = user;
        this.product = product;
        this.dateTime = dateTime;
        return false;
    }
}

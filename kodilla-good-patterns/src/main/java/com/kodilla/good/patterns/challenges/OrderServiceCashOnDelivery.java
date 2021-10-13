package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderServiceCashOnDelivery extends OrderService {
    @Override
    public boolean createOrder(User user, Product product, LocalDateTime dateTime) {
        System.out.println("Order service - product: " + product.getProductName() + "\ncustomer:" + user.getLoginName() + "\ndate of order: " + dateTime + "\nchosen payment method: CoD\n");
        return true;
    }
}

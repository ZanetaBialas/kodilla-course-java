package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SampleOrder {
    public Order retrieve() {
        User sampleUser = new User("Lusia22","Amelia", "Nowak");
        Product sampleProduct = new Product("Book");
        LocalDateTime sampleDateOrder = LocalDateTime.of(2021,8,26,12,53);

        return new Order(sampleUser, sampleProduct, sampleDateOrder);
    }
}

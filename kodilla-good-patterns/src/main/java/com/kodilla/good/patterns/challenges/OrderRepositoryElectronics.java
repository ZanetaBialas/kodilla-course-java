package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;

public class OrderRepositoryElectronics extends OrderRepository {
    private static ArrayList<Order> orderRepository = new ArrayList<>();

    @Override
    public void addOrderToRepository(Order order) {
        orderRepository.add(order);
        System.out.println("Repository service:\nThe order has been added to electronics category\n");
    }
}

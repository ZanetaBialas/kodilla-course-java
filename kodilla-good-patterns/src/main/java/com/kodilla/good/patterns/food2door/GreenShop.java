package com.kodilla.good.patterns.food2door;

public class GreenShop implements Supplier {
    @Override
    public void ordererProcess(OrderRequest orderRequest) {
        System.out.println("Welcome to Green Shop. We are working on your order.");
    }
}

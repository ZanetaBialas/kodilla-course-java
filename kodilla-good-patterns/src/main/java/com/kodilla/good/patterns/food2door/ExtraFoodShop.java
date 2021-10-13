package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Supplier{
    @Override
    public void ordererProcess(OrderRequest orderRequest) {
        System.out.println("The order in the store has the status of being prepared.");
    }
}

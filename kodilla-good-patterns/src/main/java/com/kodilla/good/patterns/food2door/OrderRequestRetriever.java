package com.kodilla.good.patterns.food2door;

public class OrderRequestRetriever {
    public OrderRequest retrive() {
        String product = "Tomatoe";
        int qtyOfProduct = 20;
        User user1 = new User("Anna Nowak");
        return new OrderRequest(product, qtyOfProduct, user1);
    }
}

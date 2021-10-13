package com.kodilla.good.patterns.food2door;

public class OrderRequest {
    private String productName;
    private int qtyOfProduct;
    private User user;

    public OrderRequest(final String productName, final int qtyOfProduct, final User user) {
        this.productName = productName;
        this.qtyOfProduct = qtyOfProduct;
        this.user = user;
    }

    public String getProductName() {
        return productName;
    }

    public int getQtyOfProduct() {
        return qtyOfProduct;
    }

    public User getUser() {
        return user;
    }
}

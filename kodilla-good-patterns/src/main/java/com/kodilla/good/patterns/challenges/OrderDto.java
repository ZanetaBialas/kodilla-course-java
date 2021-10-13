package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private User user;
    private Product product;
    private boolean purchasedItem;

    public OrderDto(final User user, final Product product, final boolean purchasedItem) {
        this.user = user;
        this.product = product;
        this.purchasedItem = purchasedItem;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isPurchasedItem() {
        return purchasedItem;
    }
}

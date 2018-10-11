package com.kodilla.good.patterns.challenges.shop;

public class OrderProductRequestDto {
    public final Product product;
    public final int quantity;

    public OrderProductRequestDto(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}

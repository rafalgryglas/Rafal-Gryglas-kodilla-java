package com.kodilla.good.patterns.food2door;

public class OrderDto {
    public final Product product;
    public final int quantity;

    public OrderDto(Product product, int quantity) {
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

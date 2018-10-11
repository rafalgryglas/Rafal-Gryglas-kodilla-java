package com.kodilla.good.patterns.challenges.shop;

import java.util.Objects;

public class OrderProduct {
    private final Product product;
    private final int productQuantity;
    private final double totalPrice;

    public OrderProduct(Product product, int productQuantity, double totalPrice) {
        this.product = product;
        this.productQuantity = productQuantity;
        this.totalPrice = totalPrice;
    }

    public Product getProduct() {
        return product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderProduct that = (OrderProduct) o;
        return productQuantity == that.productQuantity &&
                Double.compare(that.totalPrice, totalPrice) == 0 &&
                Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, productQuantity, totalPrice);
    }
}

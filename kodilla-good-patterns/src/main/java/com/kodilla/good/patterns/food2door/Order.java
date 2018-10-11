package com.kodilla.good.patterns.food2door;

public class Order {
    public final Product product;
    public final int productQuantity;

    public Order(Product product, int productQuantity) {
        this.product = product;
        this.productQuantity = productQuantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}

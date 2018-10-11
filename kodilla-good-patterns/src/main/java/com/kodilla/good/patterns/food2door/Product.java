package com.kodilla.good.patterns.food2door;

public class Product {
    private final String productName;
    private final long productNumber;

    public Product(String productName, long productNumber) {
        this.productName = productName;
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public long getProductNumber() {
        return productNumber;
    }
}

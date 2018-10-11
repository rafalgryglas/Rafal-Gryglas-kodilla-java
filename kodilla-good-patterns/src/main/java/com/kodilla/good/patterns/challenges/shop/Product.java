package com.kodilla.good.patterns.challenges.shop;

import java.util.Objects;

public class Product {
    private final String nameOfProduct;
    private final long IdProduct;
    private final double price;

    public Product(String nameOfProduct, int IdProduct, double price) {
        this.nameOfProduct = nameOfProduct;
        this.IdProduct = IdProduct;
        this.price = price;
    }

    public String getNameOfProducts() {
        return nameOfProduct;
    }

    public long getIdProduct() {
        return IdProduct;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return IdProduct == product.IdProduct &&
                Double.compare(product.price, price) == 0 &&
                Objects.equals(nameOfProduct, product.nameOfProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfProduct, IdProduct, price);
    }
}

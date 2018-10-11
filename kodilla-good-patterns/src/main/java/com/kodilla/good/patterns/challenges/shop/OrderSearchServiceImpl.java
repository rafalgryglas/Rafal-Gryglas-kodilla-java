package com.kodilla.good.patterns.challenges.shop;

public class OrderSearchServiceImpl implements OrderSearchService {
    @Override
    public Product searchProduct(long IdProduct) {
        return new Product("Orange plastic duck", 2317672, 4.99);
    }
}

package com.kodilla.good.patterns.food2door.shopAndOrder;

public interface ShopService {
    boolean process();
    boolean productAvailable(Order order);
}

package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.shopAndOrder.Order;

public interface OrderRepository {
    boolean saveOrder(Order order);
}

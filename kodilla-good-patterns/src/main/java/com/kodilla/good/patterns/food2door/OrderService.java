package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.shopAndOrder.Order;
import com.kodilla.good.patterns.food2door.shopAndOrder.ShopService;

public class OrderService {
    private final ShopService shopService;

    public OrderService(final ShopService shopService) {
        this.shopService = shopService;
    }

    public void orderProcess(final Order order) {
        if (shopService.productAvailable(order)) {
            shopService.process();
        } else {
            System.out.println("Product unavailable");
        }
    }
}

package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.foodCompanies.GlutenFreeShopImpl;
import com.kodilla.good.patterns.food2door.shopAndOrder.Order;
import com.kodilla.good.patterns.food2door.shopAndOrder.Product;
import com.kodilla.good.patterns.food2door.shopAndOrder.Shop;

public class Run {

    public static void main(String[] args) {

        Product productGFS = new Product("GlutenFreeHotDog", 10001);
        Order orderGFS = new Order(productGFS, 1);
        OrderService orderService = new OrderService(new GlutenFreeShopImpl(new Shop("Gluten Free Shop")));
        orderService.orderProcess(orderGFS);

    }
}

package com.kodilla.good.patterns.food2door.foodCompanies;

import com.kodilla.good.patterns.food2door.shopAndOrder.Order;
import com.kodilla.good.patterns.food2door.shopAndOrder.Shop;
import com.kodilla.good.patterns.food2door.shopAndOrder.ShopService;

public class HealthyShopImpl implements ShopService {
    private Shop shop;

    public HealthyShopImpl(Shop shop) {
        this.shop = shop;
    }

    @Override
    public boolean process() {
        System.out.println("Realization order in shop: " + shop.getShopName());
        return true;
    }

    @Override
    public boolean productAvailable(Order order) {
        if (order.productQuantity > 0) {
            System.out.println("Product [" + order.getProduct().getProductName() + "} available in shop: " + shop.getShopName());
            return true;
        } else {
            System.out.println("Product unavailable in shop: " + shop.getShopName());
            return false;
        }
    }
}

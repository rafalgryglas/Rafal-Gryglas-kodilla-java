package com.kodilla.good.patterns.food2door;

public class ShopStatusServiceImp implements ShopStatusService {

    private final Shop shop;

    public ShopStatusServiceImp(Shop shop) {
        this.shop = shop;
    }

    @Override
    public boolean process() {
        System.out.println("Realization order in: "+shop.getShopName());
        return true;
    }

}

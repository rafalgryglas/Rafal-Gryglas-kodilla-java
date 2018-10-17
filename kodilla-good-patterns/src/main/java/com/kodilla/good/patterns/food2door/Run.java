package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.foodCompanies.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.foodCompanies.HealthyShop;
import com.kodilla.good.patterns.food2door.shopAndOrder.Order;
import com.kodilla.good.patterns.food2door.shopAndOrder.Product;
import com.kodilla.good.patterns.food2door.shopAndOrder.Shop;

public class Run {

    public static void main(String[]args) {
        //GlutenFreeShop
        Shop glutenFree = new Shop("Gluten Free Shop");
        Product productGFS = new Product("GlutenFreeHotDog",10001);
        Order orderGFS = new Order(productGFS,2);

        GlutenFreeShop glutenFreeShop = new GlutenFreeShop(glutenFree);
        glutenFreeShop.process();
        glutenFreeShop.productAvailable(orderGFS);

        //HealthyShop
        Shop healthy = new Shop ("Healthy Shop");
        Product productH1 = new Product("bandage 10x10",1213);
        Product productH2 = new Product("bandage 20x20",1214);
        Order orderH1 = new Order(productH1,1);
        Order orderH2 = new Order(productH2,0);

        HealthyShop healthyShop = new HealthyShop(healthy);
        healthyShop.process();
        healthyShop.productAvailable(orderH1);
        healthyShop.productAvailable(orderH2);
    }
}

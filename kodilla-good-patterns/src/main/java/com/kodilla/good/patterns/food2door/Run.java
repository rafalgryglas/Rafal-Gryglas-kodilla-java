package com.kodilla.good.patterns.food2door;

public class Run {

    public static void main(String[]args) {

        Shop extraFoodShop = new Shop ("ExtraFoodShop");

        Product product = new Product("Extra Burger",10032);

        OrderDto orderDto = new OrderDto(product,2);

        RealizationProcess realizationProcess = new RealizationProcess(new ShopStatusServiceImp(extraFoodShop),
                new RealizationOrderStatusImp());
        realizationProcess.madeOrders(orderDto);
    }
}

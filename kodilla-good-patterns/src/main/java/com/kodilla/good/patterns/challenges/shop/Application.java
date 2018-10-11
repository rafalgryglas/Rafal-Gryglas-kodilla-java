package com.kodilla.good.patterns.challenges.shop;


public class Application {
    public static void main(String[] args) {
        Product product = new Product("Orange plastic duck", 2317672, 4.99);
        OrderProductRequestDto orderProductRequestDto = new OrderProductRequestDto(product, 10);

        ProductOrderService order = new ProductOrderService(new OrderSearchServiceImpl(), new BuyRepImpl());
        order.productsOrder(orderProductRequestDto);
    }
}

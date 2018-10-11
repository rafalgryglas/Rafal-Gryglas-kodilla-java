package com.kodilla.good.patterns.challenges.shop;

public class ProductOrderService implements BuyService {
    private final OrderSearchService orderSearchService;
    private final BuyRepository buyRepository;

    public ProductOrderService(OrderSearchService orderSearchService, BuyRepository buyRepository) {
        this.orderSearchService = orderSearchService;
        this.buyRepository = buyRepository;
    }

    @Override
    public void productsOrder(OrderProductRequestDto orderProductRequestDto) {
        Product product = orderSearchService.searchProduct(orderProductRequestDto.getProduct().getIdProduct());
        if (orderProductRequestDto.getQuantity() > 0) {
            double totalPrice = product.getPrice() * orderProductRequestDto.getQuantity();
            buyRepository.orderToSave(new OrderProduct(product, orderProductRequestDto.getQuantity(), totalPrice));
            System.out.println("Saved");
        } else {
            System.out.println("No order");
        }
    }
}

package com.kodilla.good.patterns.food2door;

public class RealizationProcess {
    private final ShopStatusService shopStatusService;
    private final RealizationOrderStatus realizationOrderStatus;

    public RealizationProcess(ShopStatusService shopStatusService,
                              RealizationOrderStatus realizationOrderStatus) {
        this.shopStatusService = shopStatusService;
        this.realizationOrderStatus = realizationOrderStatus;

    }
    public void madeOrders(OrderDto orderDto) {
        if (realizationOrderStatus.orderStatus()) {

            shopStatusService.process();

            OrderRepository orderRepository = new OrderRepositoryImp();
            orderRepository.saveOrder(new Order(orderDto.getProduct(),orderDto.getQuantity()));

        } else {
            System.out.println("Wrong date");
        }
    }
}

//package com.kodilla.good.patterns.food2door;
//
//import com.kodilla.good.patterns.food2door.shopAndOrder.Order;
//import com.kodilla.good.patterns.food2door.shopAndOrder.OrderDto;
//import com.kodilla.good.patterns.food2door.shopAndOrder.ShopService;
//
//public class RealizationProcess {
//    private final ShopService shopService;
//    private final RealizationOrderStatus realizationOrderStatus;
//
//    public RealizationProcess(ShopService shopService,
//                              RealizationOrderStatus realizationOrderStatus) {
//        this.shopService = shopService;
//        this.realizationOrderStatus = realizationOrderStatus;
//
//    }
//    public void madeOrders(OrderDto orderDto) {
//        if (realizationOrderStatus.orderStatus()) {
//
//            shopService.process();
//
//            OrderRepository orderRepository = new OrderRepositoryImp();
//            orderRepository.saveOrder(new Order(orderDto.getProduct(),orderDto.getQuantity()));
//
//        } else {
//            System.out.println("Wrong date");
//        }
//    }
//}

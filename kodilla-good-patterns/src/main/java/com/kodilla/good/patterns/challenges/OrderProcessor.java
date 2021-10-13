package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    final OrderService orderService;
    final InfoService infoService;
    final OrderRepository orderRepository;

    public OrderProcessor(final OrderService orderService, final InfoService infoService, final OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
        this.infoService = infoService;
        this.orderService = orderService;
    }

    public OrderDto process(final Order order) {
        boolean purchasedItem = orderService.createOrder(order.getUser(), order.getProduct(), order.getOrderDate());

        if (purchasedItem) {
            order.getUser().addOrderToUserHistory(order);
            infoService.informUserAboutOrder(order.getUser());
            orderRepository.addOrderToRepository(order);
            return new OrderDto(order.getUser(), order.getProduct(), true);
        } else {
            return new OrderDto(order.getUser(), order.getProduct(), false);
        }
    }
}

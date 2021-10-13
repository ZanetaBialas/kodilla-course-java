package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {
        SampleOrder sampleOrder = new SampleOrder();
        Order order = sampleOrder.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new OrderServiceCashOnDelivery(), new InfoServiceSms(), new OrderRepositoryElectronics());
        OrderDto orderDto = orderProcessor.process(order);

        if (orderDto.isPurchasedItem()) {
            System.out.println("Summary: " + orderDto.getProduct().getProductName() + "has been ordered by" + orderDto.getUser().getLoginName() + ".");
        } else {
            System.out.println("Summary: The order couldn't be approved.");
        }
    }
}

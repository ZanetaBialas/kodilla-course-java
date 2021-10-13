package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrive();

        Extra2DoorProcessor extra2DoorProcessor1 = new Extra2DoorProcessor(new HealthyFood(), new MailService());
        extra2DoorProcessor1.placeAnOrder(orderRequest);

        Extra2DoorProcessor extra2DoorProcessor2 = new Extra2DoorProcessor(new GreenShop(), new MailService());
        extra2DoorProcessor2.placeAnOrder(orderRequest);

        Extra2DoorProcessor extra2DoorProcessor3 = new Extra2DoorProcessor(new ExtraFoodShop(), new MailService());
        extra2DoorProcessor3.placeAnOrder(orderRequest);
    }
}

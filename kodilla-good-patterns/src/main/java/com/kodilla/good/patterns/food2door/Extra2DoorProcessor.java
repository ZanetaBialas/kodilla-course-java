package com.kodilla.good.patterns.food2door;

public class Extra2DoorProcessor {
    private Supplier supplier;
    private InformationService informationService;

    public Extra2DoorProcessor(final Supplier supplier, final  InformationService informationService) {
        this.supplier = supplier;
        this.informationService = informationService;
    }
    public void placeAnOrder(OrderRequest orderRequest) {
        supplier.ordererProcess(orderRequest);
        informationService.inform();
    }
}

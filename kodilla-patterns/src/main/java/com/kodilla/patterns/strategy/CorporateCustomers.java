package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.BalancedPredictor;

public class CorporateCustomers extends Customer {
    public CorporateCustomers (String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}

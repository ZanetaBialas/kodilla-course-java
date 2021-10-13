package com.kodilla.patterns2.decorator.pizza.crust;

import com.kodilla.patterns2.decorator.pizza.AbstractPizzaOrderDecorator;
import com.kodilla.patterns2.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class FatCrustDecorator extends AbstractPizzaOrderDecorator {
    public FatCrustDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + fat crust";
    }
}
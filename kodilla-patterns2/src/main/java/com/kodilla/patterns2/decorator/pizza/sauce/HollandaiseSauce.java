package com.kodilla.patterns2.decorator.pizza.sauce;

import com.kodilla.patterns2.decorator.pizza.PizzaOrder;
import com.kodilla.patterns2.decorator.pizza.AbstractPizzaOrderDecorator;


import java.math.BigDecimal;

public class HollandaiseSauce extends AbstractPizzaOrderDecorator {
    public HollandaiseSauce(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3.0));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + hollandaise sauce";
    }
}
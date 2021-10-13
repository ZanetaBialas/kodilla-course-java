package com.kodilla.patterns2.decorator.pizza.toppings;

import com.kodilla.patterns2.decorator.pizza.AbstractPizzaOrderDecorator;
import com.kodilla.patterns2.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class ExtraHamDecorator extends AbstractPizzaOrderDecorator {
    public ExtraHamDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3.0));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + extra ham";
    }
}

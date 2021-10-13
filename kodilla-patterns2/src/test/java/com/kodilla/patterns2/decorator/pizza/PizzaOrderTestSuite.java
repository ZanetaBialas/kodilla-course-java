package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.pizza.crust.FatCrustDecorator;
import com.kodilla.patterns2.decorator.pizza.sauce.HollandaiseSauce;
import com.kodilla.patterns2.decorator.pizza.sauce.TomatoSauce;
import com.kodilla.patterns2.decorator.pizza.size.ExtraLargeDecorator;
import com.kodilla.patterns2.decorator.pizza.toppings.BroccoliDecorator;
import com.kodilla.patterns2.decorator.pizza.toppings.ExtraCheeseDecorator;
import com.kodilla.patterns2.decorator.pizza.toppings.ExtraHamDecorator;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testExtraLargePizzaWithSauceFatCrustAndToppingsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraLargeDecorator(theOrder);
        theOrder = new TomatoSauce(theOrder);
        theOrder = new FatCrustDecorator(theOrder);
        theOrder = new BroccoliDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(35), theCost);
    }

    @Test
    public void testExtraLargePizzaWithSauceFatCrustAndToppingsDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new HollandaiseSauce(theOrder);
        theOrder = new FatCrustDecorator(theOrder);
        theOrder = new ExtraHamDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Standard pizza with cheese and tomato sauce  + extra cheese + hollandaise sauce + fat crust + extra ham", description);
    }
}
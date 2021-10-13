package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredients("Onion")
                .burgers(10)
                .sauce("Spicy")
                .bun("Thin")
                .ingredients("Chicken")
                .ingredients("Cheese")
                .build();
        System.out.println(bigmac);
        //When
        boolean ifHaveOnion = bigmac.getIngredients().contains("Onion");
        String whithSauce = bigmac.getSauce();
        int howManyBurgers = (int) bigmac.getBurgers();
        int howManyIngredients = (int) bigmac.getIngredients().size();
        //Then
        assertEquals(10, howManyBurgers);
        assertEquals("Spicy", whithSauce);
        assertEquals(3, howManyIngredients);
        assertTrue(ifHaveOnion);
    }
}

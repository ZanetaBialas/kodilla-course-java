package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        //Create continets
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent australiaAndOceania = new Continent("Australia and Oceania");
        //Create country of Europe

        Country poland = new Country("Poland");
        Country albania = new Country("Albania");
        Country belarus = new Country("Belarus");
        Country croatia = new Country("Croatia");
        Country denmark = new Country("Denmark");
        Country france = new Country("France");
        Country germany = new Country("Germany");
        Country norway = new Country("Norway");
        Country russia = new Country("Russia");
        //Create contry of South Asia
        Country armenia = new Country("Armenia");
        Country bahrain = new Country("Bahrain");
        Country bangladesh = new Country("Bangladesh");
        Country china = new Country("China");
        //Create contry of North Australia
        Country fiji = new Country("Fiji");
        Country kiribati = new Country("Kiribati");
        Country palau = new Country("Palau");
        Country samoa = new Country("Samoa");
        Country  australia = new Country("Australia");
        //Added continents to the world
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(australiaAndOceania);
        //Added country to the continents
        //Europe
        europe.addCountry(poland);
        europe.addCountry(albania);
        europe.addCountry(belarus);
        europe.addCountry(croatia);
        europe.addCountry(denmark);
        europe.addCountry(france);
        europe.addCountry(germany);
        europe.addCountry(norway);
        europe.addCountry(russia);
        //Asia
        asia.addCountry(armenia);
        asia.addCountry(bahrain);
        asia.addCountry(bangladesh);
        asia.addCountry(china);
        //Australia
        australiaAndOceania.addCountry(fiji);
        australiaAndOceania.addCountry(kiribati);
        australiaAndOceania.addCountry(palau);
        australiaAndOceania.addCountry(samoa);
        australiaAndOceania.addCountry(australia);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal totalPeopleExpected = new BigDecimal("18000018");
        assertEquals(totalPeopleExpected, totalPeople);
    }
}

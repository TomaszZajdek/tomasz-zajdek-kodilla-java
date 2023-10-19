package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        Country nigeria = new Country("Nigeria", new BigDecimal("20000000"));
        Country egypt = new Country("Egypt", new BigDecimal("102334444"));
        Country southAfrica = new Country("South Africa", new BigDecimal("57777777"));

        Country usa = new Country("USA", new BigDecimal("331902300"));
        Country canada = new Country("Canada", new BigDecimal("40000000"));
        Country mexico = new Country("Mexico", new BigDecimal("123900000"));

        Country germany = new Country("Germany", new BigDecimal("210984234"));
        Country france = new Country("France", new BigDecimal("6500000"));
        Country spain = new Country("Spain", new BigDecimal("46754101"));

        Country china = new Country("China", new BigDecimal("1444216676"));
        Country india = new Country("India", new BigDecimal("1393400099"));
        Country japan = new Country("Japan", new BigDecimal("126470094"));

        Continent asia = new Continent("Asia");
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(japan);
        Continent europe = new Continent("Europe");
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(spain);
        Continent africa = new Continent("Africa");
        africa.addCountry(nigeria);
        africa.addCountry(egypt);
        africa.addCountry(southAfrica);
        Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);

        World world = new World();
        world.addContinent(africa);
        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(northAmerica);

        //When
        BigDecimal allPeoples = world.getPeopleQuantity();
        //Then
        BigDecimal exceptedNumber = new BigDecimal("3904239725");
        Assertions.assertEquals(exceptedNumber, allPeoples);

    }
}

package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {


    private String name;
    private BigDecimal population;
    public Country(String name, BigDecimal population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPopulation() {
        return population;
    }

    public BigDecimal getPeopleQuantity(Country country) {
        return country.getPopulation();
    }
}

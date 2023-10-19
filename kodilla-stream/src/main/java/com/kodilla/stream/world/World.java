package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    List<Continent> allContinents = new ArrayList<>();

    public List<Continent> getAllContinents() {
        return allContinents;
    }

    public void addContinent(Continent continent) {
        allContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal allPeoplesAtWorld = allContinents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getPopulation())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
        return allPeoplesAtWorld;
    }
}

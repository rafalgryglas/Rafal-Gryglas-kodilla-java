package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private final Set<Continent> continentSet = new HashSet<>();

    public Set<Continent> getContinentSet() {
        return continentSet;
    }
    public void addContinentToWorld(Continent continent) {
        continentSet.add(continent);
    }
    public BigDecimal getPeopleQantity() {
        return continentSet.stream()
                .flatMap(country->country.getCountrySet().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum, current)->sum=sum.add(current));
    }
}

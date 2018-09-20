package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final String continentName;
    private final Set<Country> countrySet = new HashSet<>();

    public  Continent(final String continentName) {
        this.continentName = continentName;
    }
    public void addCountryToContinent(Country country) {
        countrySet.add(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public Set<Country> getCountrySet() {
        return countrySet;
    }
}

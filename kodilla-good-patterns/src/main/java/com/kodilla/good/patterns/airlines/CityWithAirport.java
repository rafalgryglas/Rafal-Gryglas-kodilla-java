package com.kodilla.good.patterns.airlines;

import java.util.Objects;

public class CityWithAirport {
    private final String city;
    public final String IATA;

    public CityWithAirport(String city, String IATA) {
        this.city = city;
        this.IATA = IATA;
    }

    public String getCity() {
        return city;
    }

    public String getIATA() {
        return IATA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityWithAirport that = (CityWithAirport) o;
        return Objects.equals(city, that.city) &&
                Objects.equals(IATA, that.IATA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, IATA);
    }
}

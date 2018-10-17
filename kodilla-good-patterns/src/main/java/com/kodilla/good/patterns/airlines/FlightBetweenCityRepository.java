package com.kodilla.good.patterns.airlines;

import java.util.Map;
import java.util.Set;

public interface FlightBetweenCityRepository {
    Map<CityWithAirport, Set<CityWithAirport>> destiny();
}

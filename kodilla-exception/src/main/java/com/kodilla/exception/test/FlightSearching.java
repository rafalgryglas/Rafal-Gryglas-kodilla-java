package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearching {
    private Map<String, Boolean> airportsMap;

    public FlightSearching() {
        this.airportsMap = new HashMap<>();
        airportsMap.put("Wroclaw", true);
        airportsMap.put("Warsaw", true);
        airportsMap.put("Gdansk", false);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        if (airportsMap.containsKey(flight.getDepartureAirport())) {
            return airportsMap.get(flight.getDepartureAirport());
        } else {
            throw new RouteNotFoundException("No Airports");
        }
    }
}

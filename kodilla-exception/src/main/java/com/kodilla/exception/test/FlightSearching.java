package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightSearching {
    private Map<String, Boolean> airportsMap;

    public FlightSearching() {
        this.airportsMap = new HashMap<>();
        airportsMap.put("Wroclow", true);
        airportsMap.put("Warsaw", true);
        airportsMap.put("Gdansk", false);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (flight.getArrivalAirport().equals(flight.getDepartureAirport())) {
            System.out.println("Wrong departure or arrival airport");
            return;
        }
        List<String> airports = airportsMap.entrySet().stream()
                .filter(s -> s.getValue())
                .map(s -> s.getKey())
                .collect(Collectors.toList());
        if (airports.contains(flight.getArrivalAirport()) && airports.contains(flight.getDepartureAirport())) {
            System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("No Airports");
        }
    }
}

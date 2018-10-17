package com.kodilla.good.patterns.airlines;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearchProcessor {
    public final FlightBetweenCityRepository flightBetweenCityRepository;

    public FlightSearchProcessor(FlightBetweenCityRepository flightBetweenCityRepository) {
        this.flightBetweenCityRepository = flightBetweenCityRepository;
    }

    public void searchFlightFromCity(CityWithAirport cityWithAirport) {
        Map<CityWithAirport, Set<CityWithAirport>> mapFlight = flightBetweenCityRepository.destiny();

        if (mapFlight.containsKey(cityWithAirport)) {
            List<String> list = mapFlight.get(cityWithAirport).stream()
                    .map(CityWithAirport::getCity)
                    .collect(Collectors.toList());
            System.out.println("Flights from: " + cityWithAirport.getCity() + " to: " + list.toString());
        } else {
            System.out.println("No flights");
        }
    }

    public void searchFlightToCity(CityWithAirport cityWithAirport) {
        Map<CityWithAirport, Set<CityWithAirport>> mapFlight = flightBetweenCityRepository.destiny();

        if (mapFlight.containsKey(cityWithAirport)) {
            List<String> list = mapFlight.entrySet().stream()
                    .filter(entry -> entry.getValue().contains(cityWithAirport))
                    .map(entry -> entry.getKey().getCity())
                    .collect(Collectors.toList());
            System.out.println("Flights to: " + cityWithAirport.getCity() + " from: " + list.toString());
        } else {
            System.out.println("No flights");
        }
    }

    public void searchFlightByAnotherCity(CityWithAirport from, CityWithAirport thru, CityWithAirport to) {
        Map<CityWithAirport, Set<CityWithAirport>> mapFlight = flightBetweenCityRepository.destiny();

        if (mapFlight.containsKey(from) && mapFlight.containsKey(thru) && mapFlight.containsKey(to)) {
            List<String> list = mapFlight.get(from).stream()
                    .filter(f -> f.getCity().equals(thru.getCity()))
                    .map(CityWithAirport::getCity)
                    .collect(Collectors.toList());
            System.out.println("Flights from: " + from.getCity() + " to: " + list.toString());
            list = mapFlight.get(thru).stream()
                    .filter(f -> f.getCity().equals(to.getCity()))
                    .map(CityWithAirport::getCity)
                    .collect(Collectors.toList());
            System.out.println("Flights from: " + thru.getCity() + " to: " + list.toString());
        } else {
            System.out.println("No flights");
        }
    }
}

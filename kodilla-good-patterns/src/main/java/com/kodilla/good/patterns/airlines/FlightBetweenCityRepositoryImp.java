package com.kodilla.good.patterns.airlines;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FlightBetweenCityRepositoryImp implements FlightBetweenCityRepository {
    public Map<CityWithAirport, Set<CityWithAirport>> destiny() {
        CityWithAirport gdansk = new CityWithAirport("Gdańsk", "GDN");
        CityWithAirport olsztynMazury = new CityWithAirport("Olsztyn-Mazury", "SZY");
        CityWithAirport warszawa = new CityWithAirport("Warszawa", "WAW");
        CityWithAirport wroclaw = new CityWithAirport("Wroclaw", "WRO");
        CityWithAirport modlin = new CityWithAirport("Warszawa-Modlin", "WMI");
        CityWithAirport krakow = new CityWithAirport("Krakow", "KRK");

        Set<CityWithAirport> gdanskSet = new HashSet<>();
        Set<CityWithAirport> olsztynMazurySet = new HashSet<>();
        Set<CityWithAirport> warszawaSet = new HashSet<>();
        Set<CityWithAirport> wroclawSet = new HashSet<>();
        Set<CityWithAirport> modlinSet = new HashSet<>();
        Set<CityWithAirport> krakowSet = new HashSet<>();

        gdanskSet.add(olsztynMazury);
        gdanskSet.add(warszawa);
        gdanskSet.add(modlin);
        olsztynMazurySet.add(modlin);
        olsztynMazurySet.add(gdansk);
        warszawaSet.add(gdansk);
        warszawaSet.add(krakow);
        warszawaSet.add(wroclaw);
        wroclawSet.add(modlin);
        wroclawSet.add(gdansk);
        modlinSet.add(wroclaw);
        modlinSet.add(olsztynMazury);
        krakowSet.add(olsztynMazury);
        krakowSet.add(warszawa);
        krakowSet.add(gdansk);

        Map<CityWithAirport, Set<CityWithAirport>> destinationFlight = new HashMap<>();
        destinationFlight.put(gdansk, gdanskSet);
        destinationFlight.put(olsztynMazury, olsztynMazurySet);
        destinationFlight.put(warszawa, warszawaSet);
        destinationFlight.put(wroclaw, wroclawSet);
        destinationFlight.put(modlin, modlinSet);
        destinationFlight.put(krakow, krakowSet);

        return destinationFlight;
    }
}

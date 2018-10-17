package com.kodilla.good.patterns.airlines;

public class Run {
    public static void main(String[] args) {
        CityWithAirport gdansk = new CityWithAirport("Gdańsk", "GDN");
        CityWithAirport olsztynMazury = new CityWithAirport("Olsztyn-Mazury", "SZY");
        CityWithAirport warszawa = new CityWithAirport("Warszawa", "WAW");

        FlightBetweenCityRepository flightBetweenCityRepository = new FlightBetweenCityRepositoryImp();
        FlightSearchProcessor flightSearchProcessor = new FlightSearchProcessor(flightBetweenCityRepository);

        flightSearchProcessor.searchFlightFromCity(gdansk);
        flightSearchProcessor.searchFlightToCity(olsztynMazury);
        flightSearchProcessor.searchFlightByAnotherCity(olsztynMazury, gdansk, warszawa);
    }
}

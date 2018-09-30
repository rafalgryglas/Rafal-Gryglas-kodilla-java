package com.kodilla.exception.test;


public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {

        Flight flight = new Flight("Gdansk", "Warsaw");

        FlightSearching flightSearching = new FlightSearching();

        try {
            System.out.println(flightSearching.findFlight(flight));
        } catch (RouteNotFoundException o) {
            System.out.println("Something wrong with " + o);
        } finally {
            System.out.println("Process completed");
        }
    }
}

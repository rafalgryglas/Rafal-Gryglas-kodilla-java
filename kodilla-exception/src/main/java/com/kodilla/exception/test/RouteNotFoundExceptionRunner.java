package com.kodilla.exception.test;


public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {

        Flight flight = new Flight("Wroclow", "Warsaw");

        FlightSearching flightSearching = new FlightSearching();

        try {
            flightSearching.findFlight(flight);
        } catch (RouteNotFoundException o) {
            System.out.println("Something wrong with " + o);
        } finally {
            System.out.println("Process completed");
        }
    }
}

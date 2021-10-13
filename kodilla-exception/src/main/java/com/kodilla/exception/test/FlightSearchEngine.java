package com.kodilla.exception.test;

public class FlightSearchEngine {
    public static void main(String[] args) {
        FlightList flightList = new FlightList();
        Flight flight = new Flight("Mangalore, India", "San Sebastien, Spain");

        Flight anotherFlight = new Flight("Lansing, USA", "Izmir, Turkey");

        try {
            flightList.findFlight(flight);
            flightList.findFlight(anotherFlight);
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not found!");
        }
    }
}

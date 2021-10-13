package com.kodilla.good.patterns.company;

import java.util.Map;

public class Application {
    public static void main(String[] args) {
        FlightService flightService = new FlightService();

        Map<FlightNumber, FlightDirection> firstFlight;
        firstFlight = flightService.searchFlightFrom("Hamburg");
        flightService.viewResult(firstFlight);

        Map<FlightNumber, FlightDirection> secondFlight;
        secondFlight = flightService.searchFlightTo("Madeira");
        flightService.viewResult(secondFlight);

        flightService.searchIndirectFlight("Hamburg", "Malta");
    }
}

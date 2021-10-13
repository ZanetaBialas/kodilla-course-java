package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightList {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightList = new HashMap<>();

        flightList.put("Mangalore, India", true);
        flightList.put("Valverde, Spain", true);
        flightList.put("San Sebastien, Spain", false);
        flightList.put("Galapagos, Ecuador", true);
        flightList.put("Lansing, USA", false);
        flightList.put("St. John's, Canada", true);
        flightList.put("Izmir, Turkey", true);
        flightList.put("Accra, Ghana", true);

        if(flightList.containsKey(flight.getArrivalAirport())) {
            System.out.println("Flight to: " + flight.getArrivalAirport() + "exist" );
        } else {
            throw  new RouteNotFoundException("Flight not found!");
        }
    }
}

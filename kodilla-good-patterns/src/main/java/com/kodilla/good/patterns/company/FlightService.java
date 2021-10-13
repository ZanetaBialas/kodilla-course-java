package com.kodilla.good.patterns.company;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightService {
    private HashMap<FlightNumber, FlightDirection> airplaneFlightSchedule = new HashMap<>();

    public FlightService() {
        airplaneFlightSchedule.put(new FlightNumber(20360), new FlightDirection("Frankfurt", "London"));
        airplaneFlightSchedule.put(new FlightNumber(20361), new FlightDirection("Frankfurt-Hahn","Majorca" ));
        airplaneFlightSchedule.put(new FlightNumber(20362), new FlightDirection("Hamburg", "Madeira"));
        airplaneFlightSchedule.put(new FlightNumber(20363), new FlightDirection("Bremen", "Malta"));
        airplaneFlightSchedule.put(new FlightNumber(20364), new FlightDirection("Dortmund", "Athens"));
        airplaneFlightSchedule.put(new FlightNumber(20365), new FlightDirection("Munich", "Sofia"));
        airplaneFlightSchedule.put(new FlightNumber(20366), new FlightDirection("Düsseldorf", "Copenhagen"));
        airplaneFlightSchedule.put(new FlightNumber(20367), new FlightDirection("Hanover", "Lisbon"));
    }
    public Map<FlightNumber, FlightDirection> searchFlightFrom(String startPoint) {
        return airplaneFlightSchedule.entrySet().stream()
                .filter(e-> e.getValue().getDepartureAirport().equals(startPoint))
                .collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
    }
    public Map<FlightNumber, FlightDirection> searchFlightTo(String endPoint) {
        return airplaneFlightSchedule.entrySet().stream()
                .filter(e->e.getValue().getLandingAirport().equals(endPoint))
                .collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
    }
    public void viewResult(Map<FlightNumber, FlightDirection> map) {
        map.entrySet().stream()
                .forEach(e-> System.out.println(e.getKey() + " " + e.getValue()));
    }
    public void searchIndirectFlight(String startPoint, String endPoint) {

        Map<FlightNumber, FlightDirection> startMap = searchFlightFrom(startPoint);
        Map<FlightNumber, FlightDirection> endMap = searchFlightTo(endPoint);

        for (Map.Entry<FlightNumber, FlightDirection> entry: startMap.entrySet()) {
            endMap.entrySet().stream()
                    .filter(e->e.getValue().getDepartureAirport().equals(entry.getValue().getLandingAirport()))
                    .forEach(e-> System.out.println(entry + " " + e));
        }
    }
}

package com.kodilla.good.patterns.company;

public class FlightDirection {
    private String departureAirport;
    private String landingAirport;

    public FlightDirection(final String departureAirport, final String landingAirport) {
        this.departureAirport = departureAirport;
        this.landingAirport = landingAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getLandingAirport() {
        return landingAirport;
    }
    @Override
    public String toString(){
        return "Depature Airport is: " + departureAirport + "\nLanding Airport is: " + landingAirport;
    }
}

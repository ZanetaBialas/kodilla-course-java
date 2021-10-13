package com.kodilla.good.patterns.company;

public class FlightNumber {
    final int flightNumber;

    public FlightNumber(final int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }
    @Override
    public int hashCode(){
        if (flightNumber%2==0) {
            return 2;
        } else {
            return 1;
        }
    }
    @Override
    public String toString() {
        return "\nFLIGHT NR: " + flightNumber;
    }
}

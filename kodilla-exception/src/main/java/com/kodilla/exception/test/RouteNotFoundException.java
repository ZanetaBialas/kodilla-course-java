package com.kodilla.exception.test;

public class RouteNotFoundException extends Throwable {
    public RouteNotFoundException(final String message) {
        super (message);
    }
}

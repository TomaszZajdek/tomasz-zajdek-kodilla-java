package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args) {
        FlightManager flightManager = new FlightManager();

        try {
            flightManager.findFlight(new Flight("Hong kong", "Tarnow"));
        } catch (RouteNotFoundException e) {
            System.out.println("Wrong direction " + e);
        }
    }
}

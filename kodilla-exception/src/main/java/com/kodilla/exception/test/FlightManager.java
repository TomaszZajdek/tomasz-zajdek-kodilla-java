package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightManager {
    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> availableFlight = new HashMap<>();
        if(availableFlight.containsKey(flight.arrivalAirport)) {
            return availableFlight.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }
}

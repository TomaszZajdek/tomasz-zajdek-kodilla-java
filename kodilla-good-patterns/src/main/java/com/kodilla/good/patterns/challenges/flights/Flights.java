package com.kodilla.good.patterns.challenges.flights;

import java.time.ZonedDateTime;

public class Flights {
    private Airports departureAirport;
    private Airports arrivalAirport;
    private ZonedDateTime departureTime;
    private ZonedDateTime arrivalTime;

    public Flights(Airports departureAirport, Airports arrivalAirport, ZonedDateTime departureTime, ZonedDateTime arrivalTime) {
        if (departureAirport == null || arrivalAirport == null || departureTime == null || arrivalTime == null) {
            throw new IllegalArgumentException("None of the parameters can be null");
        }
        if (departureTime.isAfter(arrivalTime)) {
            throw new IllegalArgumentException("Departure time cannot be after arrival time");
        }
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Airports getDepartureAirport() {
        return departureAirport;
    }

    public Airports getArrivalAirport() {
        return arrivalAirport;
    }

    public ZonedDateTime getDepartureTime() {
        return departureTime;
    }

    public ZonedDateTime getArrivalTime() {
        return arrivalTime;
    }
}

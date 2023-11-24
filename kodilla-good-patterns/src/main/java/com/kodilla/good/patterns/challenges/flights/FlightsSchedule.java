package com.kodilla.good.patterns.challenges.flights;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsSchedule {
    private HashMap<String, ArrayList<Flights>> scheduleDepartureAirport;
    private HashMap<String, ArrayList<Flights>> scheduleArrivalAirport;
    public FlightsSchedule() {
        scheduleDepartureAirport = new HashMap<>();
        scheduleArrivalAirport = new HashMap<>();
    }
    public void addFlight(Flights flight) {
        if (flight == null) {
            throw new IllegalArgumentException("Flight cannot be null");
        }

        String departureAirportCode = flight.getDepartureAirport().getShortcut();
        String arrivalAirportCode = flight.getArrivalAirport().getShortcut();

        scheduleDepartureAirport.computeIfAbsent(departureAirportCode, k -> new ArrayList<>()).add(flight);
        scheduleArrivalAirport.computeIfAbsent(arrivalAirportCode, k -> new ArrayList<>()).add(flight);
    }
    public List<Flights> getFlightsFrom(String airportCode) {
        return scheduleDepartureAirport.getOrDefault(airportCode, new ArrayList<>())
                .stream()
                .filter(flights -> flights.getDepartureTime().isAfter(ZonedDateTime.now()))
                .collect(Collectors.toList());
    }

    public List<Flights> getFlightsTo(String airportCode) {
        return scheduleArrivalAirport.getOrDefault(airportCode, new ArrayList<>())
                .stream()
                .filter(flights -> flights.getDepartureTime().isAfter(ZonedDateTime.now()))
                .collect(Collectors.toList());
    }
    public List<Flights> getConnectedFlights(String departureAirportCode, String destinationAirportCode) {
        List<Flights> connectedFlights = new ArrayList<>();
        List<Flights> departureFlights = scheduleDepartureAirport.getOrDefault(departureAirportCode, new ArrayList<>());


        for(Flights departureFlight : departureFlights) {
            String connectingAirport = departureFlight.getArrivalAirport().getShortcut();
            ZonedDateTime arrivalTimeAtConnectingAirport = departureFlight.getArrivalTime();
            List<Flights> connectingFlights = scheduleDepartureAirport.getOrDefault(connectingAirport, new ArrayList<>())
                    .stream()
                    .filter(flight -> flight.getArrivalAirport().getShortcut().equals(destinationAirportCode))
                    .filter(flight -> flight.getDepartureTime().isAfter(arrivalTimeAtConnectingAirport))
                    .collect(Collectors.toList());

            connectedFlights.addAll(connectingFlights);
        }
        return connectedFlights;
    }

}

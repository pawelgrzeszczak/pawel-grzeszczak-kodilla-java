package com.kodilla.good.patterns.loty;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class FlightProcessor {
    private final Flights flights;


    public FlightProcessor(final Flights flights) {
        this.flights = flights;
    }

    List<Flight> findFlightFrom(Airport airport) {
        return flights.getFlightsList().stream()
                .filter(flight -> flight.getFrom().equals(airport))
                .collect(toList());
    }

    List<Airport> findFlightTo() {
        return null;
    }

    List<Airport> findFlightWithTransfer() {
        return null;
    }
}

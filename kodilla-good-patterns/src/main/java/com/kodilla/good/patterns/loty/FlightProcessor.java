package com.kodilla.good.patterns.loty;

import java.util.List;
import java.util.stream.Collectors;

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

    List<Flight> findFlightTo(Airport airport) {
        return flights.getFlightsList().stream()
                .filter(flight -> flight.getTo().equals(airport))
                .collect(toList());
    }

    List<Flight> findFlightWithTransfer(Airport airportFrom, Airport airportTransfer, Airport airportTo) {
        return flights.getFlightsList().stream()
                .filter(flightFrom -> flightFrom.getFrom().equals(airportFrom))
//                .filter(transfer -> transfer.getFrom().equals(airportTransfer))
//                .filter(flightTo -> flightTo.getTo().equals(airportTo))
                .collect(Collectors.toList());
    }
}

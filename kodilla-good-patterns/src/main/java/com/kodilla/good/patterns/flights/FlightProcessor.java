package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
       List<Flight> flightsFrom = findFlightFrom(airportFrom);
       List<Flight> flightsTransfer = flightsFrom.stream()
               .filter(ft -> ft.getTo().equals(airportTransfer))
               .collect(toList());

       List<Flight> flightsTo = findFlightFrom(airportTransfer).stream()
               .filter(f -> f.getTo().equals(airportTo))
               .collect(toList());

       return Stream.of(flightsTransfer, flightsTo)
               .flatMap(lists -> lists.stream())
               .collect(toList());
    }
}

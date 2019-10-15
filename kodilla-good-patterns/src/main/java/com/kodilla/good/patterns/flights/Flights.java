package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class Flights {
    private List<Flight> flightsList;

    public Flights() {
        flightsList = new ArrayList<>();
    }

    void addFlight(Airport from, Airport to) {
        Flight flight = new Flight(from, to);
        flightsList.add(flight);
    }

    public List<Flight> getFlightsList() {
        return flightsList;
    }
}





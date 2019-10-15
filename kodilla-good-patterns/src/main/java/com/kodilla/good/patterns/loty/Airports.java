package com.kodilla.good.patterns.loty;

import java.util.HashMap;
import java.util.Map;

public class Airports {
    private Map<String, Airport> airports;

    public Airports() {
        airports = new HashMap<>();
    }

    void addAirport(String airportName) {
        Airport airport = new Airport(airportName);
        airports.put(airportName, airport);
    }

    Airport getAirport(String airportName) {
        return airports.get(airportName);
    }
}

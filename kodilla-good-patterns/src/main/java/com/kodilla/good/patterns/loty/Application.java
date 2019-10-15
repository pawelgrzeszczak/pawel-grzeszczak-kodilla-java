package com.kodilla.good.patterns.loty;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Airports airports = new Airports();
        airports.addAirport("Gdansk");
        airports.addAirport("Krakow");
        airports.addAirport("Wroclaw");

        Flights flights = new Flights();
        flights.addFlight(airports.getAirport("Krakow"), airports.getAirport("Wroclaw"));

        FlightProcessor flightProcessor = new FlightProcessor(flights);
        List<Flight> lista = flightProcessor.findFlightFrom(airports.getAirport("Krakow"));

        System.out.println(lista);

    }
}

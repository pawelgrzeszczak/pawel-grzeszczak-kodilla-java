package com.kodilla.good.patterns.flights;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Airports airports = new Airports();
        airports.addAirport("Gdansk");
        airports.addAirport("Krakow");
        airports.addAirport("Wroclaw");
        airports.addAirport("Kielce");
        airports.addAirport("Warszawa");

        Flights flights = new Flights();
        flights.addFlight(airports.getAirport("Gdansk"), airports.getAirport("Krakow"));
        flights.addFlight(airports.getAirport("Krakow"), airports.getAirport("Wroclaw"));
        flights.addFlight(airports.getAirport("Kielce"), airports.getAirport("Warszawa"));
        flights.addFlight(airports.getAirport("Kielce"), airports.getAirport("Wroclaw"));

        FlightProcessor flightProcessor = new FlightProcessor(flights);
        List<Flight> findFlightFromList = flightProcessor.findFlightFrom(airports.getAirport("Krakow"));
        List<Flight> findFlightToList = flightProcessor.findFlightTo(airports.getAirport("Wroclaw"));
        List<Flight> findFlightWithTransferList = flightProcessor.findFlightWithTransfer(airports.getAirport("Gdansk"),
                airports.getAirport("Krakow"), airports.getAirport("Wroclaw"));

        System.out.println("Flights from Krakow: " + findFlightFromList);
        System.out.println("Flights to Wroclaw: " + findFlightToList);
        System.out.println("Flights from Krakow to Wroclaw with transfer in Krakow: " + findFlightWithTransferList);
    }
}

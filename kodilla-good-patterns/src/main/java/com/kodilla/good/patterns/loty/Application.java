package com.kodilla.good.patterns.loty;

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
//        flights.addFlight(airports.getAirport("Krakow"), airports.getAirport("Wroclaw"));
        flights.addFlight(airports.getAirport("Gdansk"), airports.getAirport("Krakow"));
        flights.addFlight(airports.getAirport("Krakow"), airports.getAirport("Wroclaw"));
        flights.addFlight(airports.getAirport("Kielce"), airports.getAirport("Warszawa"));
        flights.addFlight(airports.getAirport("Kielce"), airports.getAirport("Wroclaw"));

        FlightProcessor flightProcessor = new FlightProcessor(flights);
//        List<Flight> lista = flightProcessor.findFlightFrom(airports.getAirport("Krakow"));
        List<Flight> lista2 = flightProcessor.findFlightTo(airports.getAirport("Wroclaw"));
        List<Flight> lista3 = flightProcessor.findFlightWithTransfer(airports.getAirport("Gdansk"),
                airports.getAirport("Krakow"), airports.getAirport("Wroclaw"));


//        System.out.println(lista1);
//        System.out.println(lista2);
        System.out.println(lista3);


    }
}

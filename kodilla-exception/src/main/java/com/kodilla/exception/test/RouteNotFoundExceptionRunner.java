package com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {

    public static void main(String[] args) throws RouteNotFoundException {
        Flight flight1 = new Flight("Szczecin", "Gdansk");
        FindFlight testFindFlight = new FindFlight();

        try {
            testFindFlight.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Lot niemozliwy z tego lotniska - " + e);
        }

        System.out.println("Processing other logic!");
    }
}

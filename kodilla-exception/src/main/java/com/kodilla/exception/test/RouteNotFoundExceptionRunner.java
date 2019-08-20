package com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {

    public static void main(String[] args) {
        Flight flight1 = new Flight("Warszawa", "Warszawa");
        FindFlight testFindFlight = new FindFlight();
        testFindFlight.findFlight(flight1);
//        try {
//            testFindFlight.findFlight(flight1);
//        } catch (RouteNotFoundException e) {
//            System.out.println("Lot nie znaleziony");
//        }

        System.out.println("Processing other logic!");
    }
}

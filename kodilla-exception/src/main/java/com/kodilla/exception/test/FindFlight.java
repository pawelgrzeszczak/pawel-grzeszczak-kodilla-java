package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<String, Boolean>();

        flights.put("Warszawa", true);
        flights.put("Radom", true);
        flights.put("Kielce", false);

        //System.out.println("Istnieje lot do ?: " + flights.containsKey(flight.getArrivalAirport()));

        if (flights.containsKey(flight.getArrivalAirport())) {
            System.out.println("Przylot mozliwy z: " + flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Object doesn't exist");
        }
    }
}

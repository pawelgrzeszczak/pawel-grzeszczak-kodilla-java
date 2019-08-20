package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public void findFlight(Flight flight) {
        Map<String, Boolean> flights = new HashMap<String, Boolean>();

        flights.put("Warszawa", true);
        flights.put("Radom", true);
        flights.put("Kielce", false);

        for(Map.Entry<String, Boolean> entry : flights.entrySet()) {

//            String value = entry.getKey();
//
//            if(value == flight.getDepartureAirport()) {
//                System.out.println("Lot mozliwy z: " + value);
//            } else if(value != flight.getDepartureAirport()) {
//                System.out.println("Lot niemozliwy z: " + value);
//            }

            if(entry.getKey() == flight.getDepartureAirport()) {
                System.out.println("Odlot mozliwy z: " + entry.getKey());
//            } else {
//                throw new RouteNotFoundException("Object doesn't exist");
//            }

            } else if(entry.getKey() != flight.getDepartureAirport()) {
                System.out.println("Odlot niemozliwy z: " + entry.getKey());
            }

//            if(entry.getKey() == flight.getArrivalAirport()) {
//                System.out.println("Przylot mozliwy z : " + entry.getKey());
//            } else {
//                System.out.println("Przylot niemozliwy z: " + entry.getKey());
//            }

            //System.out.println("Flights: " + entry.getKey() + " Is possible?: " + entry.getValue());
        }
    }
}

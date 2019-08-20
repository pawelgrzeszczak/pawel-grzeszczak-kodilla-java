package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flights = new HashMap<String, Boolean>();

        flights.put("Warszawa", true);
        flights.put("Radom", true);
        //flights.put("Kielce", false);

        for(Map.Entry<String, Boolean> entry : flights.entrySet()) {

//            if(entry.getKey() == flight.getDepartureAirport()) {
//                System.out.println("Odlot mozliwy z: " + entry.getKey());
//            } else {
//                System.out.println("##Odlot niemozliwy z: " + entry.getKey());
//                throw new RouteNotFoundException("Object doesn't exist");
//            }
//
//            if(entry.getKey() == flight.getArrivalAirport()) {
//                System.out.println("Przylot mozliwy z: " + entry.getKey());
//            } else {
//                System.out.println("##Przylot niemozliwy z: " + entry.getKey());
//                throw new RouteNotFoundException("Object doesn't exist");
//            }


            if(entry.getKey() == flight.getDepartureAirport()) {
                System.out.println("Odlot mozliwy z: " + entry.getKey());
                break;
            }
            if(entry.getKey() == flight.getArrivalAirport()) {
                System.out.println("Przylot mozliwy z: " + entry.getKey());
                break;

            } else {
                System.out.println("##Lotnisko nie istnieje z: " + entry.getKey());
                throw new RouteNotFoundException("Object doesn't exist");
            }
            //System.out.println("Flights: " + entry.getKey() + " Is possible?: " + entry.getValue());
        }
    }
}

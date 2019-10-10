package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    // Klasa World powinna zawierać kolekcję kontynentów
    private final List<Continent> continents = new ArrayList<>();

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return peopleQuantity;
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }



   /* Klasa World powinna zawierać kolekcję kontynentów
    W klasie World napisz metodę getPeopleQuantity() zwracającą liczbę typu BigDecimal, która używając flatMap()
    oraz reduce() obliczy sumę ludności wszystkich krajów na wszystkich kontynentach.*/
}


/*package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    // Klasa World powinna zawierać kolekcję kontynentów
    private final List<Continent> continents = new ArrayList<>();

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO,(sum, current) -> sum = sum.add(current));
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public List<Continent> getContinents() {
        return continents;
    }
}*/
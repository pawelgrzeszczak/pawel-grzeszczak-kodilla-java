package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    // Klasa Continent powinna zawierać kolekcję krajów leżących na tym kontynencie
    private final List<Country> countries = new ArrayList<>();

    public void addCountry(Country country) {
        countries.add(country);
    }

    public List<Country> getCountries() {
        //return countries;
        return new ArrayList<>(countries);
    }
}


/*package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    // Klasa Continent powinna zawierać kolekcję krajów leżących na tym kontynencie
    private final List<Country> countries = new ArrayList<>();

    public List<Country> getCountries() {
        return countries;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

}*/
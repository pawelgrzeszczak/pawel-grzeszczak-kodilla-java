package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    // Klasa Country ma udostępniać metodę getPeopleQuantity() zwracającą liczbę typu BigDecimal
    private final BigDecimal peopleQuantity;

    public Country(final BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}


/*
package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    // Klasa Country ma udostępniać metodę getPeopleQuantity() zwracającą liczbę typu BigDecimal
    private final BigDecimal peopleQuantity;

    public Country(final BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
*/

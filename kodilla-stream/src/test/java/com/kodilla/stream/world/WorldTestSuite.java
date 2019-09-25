package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    private World initializeWorld() {

        Country russia = new Country(new BigDecimal("142490272"));
        Country poland = new Country(new BigDecimal("81669392"));
        Country germany = new Country(new BigDecimal("80995685"));
        Continent europe = new Continent();
        europe.addCountry(russia);
        europe.addCountry(poland);
        europe.addCountry(germany);



        Country china = new Country(new BigDecimal("1332043605"));
        Country india = new Country(new BigDecimal("1137976000"));
        Country indonesia = new Country(new BigDecimal("237552000"));
        Continent asia = new Continent();
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(indonesia);


        Country nigeria = new Country(new BigDecimal("146252312"));
        Country egypt = new Country(new BigDecimal("81714020"));
        Country ethiopia = new Country(new BigDecimal("78254200"));
        Continent africa = new Continent();
        africa.addCountry(nigeria);
        africa.addCountry(egypt);
        africa.addCountry(ethiopia);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        return world;
    }

    @Test
    public void testGetPeopleQuantity() {
        // Given
        World world = initializeWorld();

        // When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        // Then
        BigDecimal peopleExpected = new BigDecimal("3318947486");
        Assert.assertEquals(peopleExpected, peopleQuantity);
    }

}

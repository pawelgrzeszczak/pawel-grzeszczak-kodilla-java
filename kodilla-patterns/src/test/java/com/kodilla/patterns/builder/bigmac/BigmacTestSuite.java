package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilderm()
                .bun("sezam")
                .burgers(2)
                .ingredients("ser")
                .sauce("standard")
                .ingredients("sałata")
                .ingredients("cebula")
                .ingredients("bekon")
                .ingredients("ogórek")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(5, howManyIngredients);

    }
}

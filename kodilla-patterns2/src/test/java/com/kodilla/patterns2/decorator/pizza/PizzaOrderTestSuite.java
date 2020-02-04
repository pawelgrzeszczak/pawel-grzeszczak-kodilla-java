package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }
    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Ordered pizza description:\nbottom(\"Thin\") + sauce(\"Tomato sauce\") + ingredient(\"Cheese\")", description);
    }
    @Test
    public void testCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(19), theCost);
    }
    @Test
    public void testCheeseDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Ordered pizza description:\nbottom(\"Thin\") + sauce(\"Tomato sauce\") + ingredient(\"Cheese\") + ingredient(\"Cheese\")", description);
    }
    @Test
    public void testHamAndCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(24), theCost);
    }
    @Test
    public void testHamAndCheeseDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Ordered pizza description:\nbottom(\"Thin\") + sauce(\"Tomato sauce\") + ingredient(\"Cheese\") + ingredient(\"Ham\") + ingredient(\"Cheese\")", description);
    }
    @Test
    public void testHamAndCheeseMushroomsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(26), theCost);
    }
    @Test
    public void testHamAndCheeseMushroomsDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HamDecorator(theOrder);
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Ordered pizza description:\nbottom(\"Thin\") + sauce(\"Tomato sauce\") + ingredient(\"Cheese\") + ingredient(\"Ham\") + ingredient(\"Cheese\") + ingredient(\"Mushrooms\")", description);
    }
}

package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape circle = new Circle(3.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(circle);
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertNotNull(result);

    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape circle = new Circle(3.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.removeFigure(circle);
        //Then
        Assert.assertEquals(0, shapeCollector.getShapeListSize());

    }

    @Test
    public void testGetFigure() {
        //Given
        Shape circle = new Circle(3.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle, result);

    }
}

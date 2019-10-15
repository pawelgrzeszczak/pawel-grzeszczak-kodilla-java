package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
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
    public void testOddNumbersExterminatorEmptyList() {
        // sprawdzi, czy klasa zachowuje się poprawnie, gdy lista jest pusta
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayList<Integer> emptyList2 = new ArrayList<>();
        //oddNumbersExterminator.exterminate(null);
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty ArrayList");
        //Then
        Assert.assertEquals(emptyList2, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //sprawdzi, czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(0);
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);
        normalList.add(7);
        normalList.add(8);
        normalList.add(9);
        normalList.add(10);

        ArrayList<Integer> normalList2 = new ArrayList<>();
        normalList2.add(0);
        normalList2.add(2);
        normalList2.add(4);
        normalList2.add(6);
        normalList2.add(8);
        normalList2.add(10);
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal ArrayList");
        //Then
        Assert.assertEquals(normalList2, result);
    }
}

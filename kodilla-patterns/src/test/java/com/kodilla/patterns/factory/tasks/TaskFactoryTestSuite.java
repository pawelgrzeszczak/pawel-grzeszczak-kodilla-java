package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        System.out.println(driving.executeTask());
        //Then
        Assert.assertEquals("Driving Task", driving.getTaskName());
        Assert.assertEquals("Zadanie DrivingTask zostało wykonane", driving.executeTask());
        Assert.assertTrue(driving.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        System.out.println(painting.executeTask());
        //Then
        Assert.assertEquals("Painting Task", painting.getTaskName());
        Assert.assertEquals("Zadanie PaintingTask zostało wykonane", painting.executeTask());
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoping = factory.makeTask(TaskFactory.SHOPPING);
        System.out.println(shoping.executeTask());
        //Then
        Assert.assertEquals("Shopping Task", shoping.getTaskName());
        Assert.assertEquals("Zadanie ShoppingTask zostało wykonane", shoping.executeTask());
        Assert.assertTrue(shoping.isTaskExecuted());
    }
}

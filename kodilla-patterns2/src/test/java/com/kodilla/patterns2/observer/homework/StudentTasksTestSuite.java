package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTasksTestSuite {
    @Test
    public void notifyAboutNewTask() {
        //Given
        StudentTasks johnSmithTasks = new StudentTasks(new Student("John Smith"));
        StudentTasks jessiePinkmanTasks = new StudentTasks(new Student("Jessie Pinkman"));
        StudentTasks ivoneEscobarTasks = new StudentTasks(new Student("Ivone Escobar"));
        Mentor piterKowalsky = new Mentor("Piter Kowalsky");
        Mentor robPrimavera = new Mentor("Rob Primavera");
        johnSmithTasks.registerObserver(piterKowalsky);
        jessiePinkmanTasks.registerObserver(piterKowalsky);
        ivoneEscobarTasks.registerObserver(robPrimavera);
        //When
        johnSmithTasks.addTaskToQueue("task 24.1");
        ivoneEscobarTasks.addTaskToQueue("task 8.1");
        johnSmithTasks.addTaskToQueue("task 24.4");
        johnSmithTasks.addTaskToQueue("task 20.2");
        jessiePinkmanTasks.addTaskToQueue("task 9.1");
        ivoneEscobarTasks.addTaskToQueue("task 19.2");
        //Then
        assertEquals(4, piterKowalsky.getUpdateCount());
        assertEquals(2, robPrimavera.getUpdateCount());
        assertEquals(1, jessiePinkmanTasks.getExercises().size());
        assertEquals(2, ivoneEscobarTasks.getExercises().size());
        assertEquals(3, johnSmithTasks.getExercises().size());
    }
}

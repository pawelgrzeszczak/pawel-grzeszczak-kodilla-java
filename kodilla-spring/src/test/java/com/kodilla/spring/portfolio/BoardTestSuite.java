package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class BoardTestSuite {

    @Test
    public void testBeansExist() {
        //Given
        ApplicationContext contex = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When
        boolean boardExists = contex.containsBean("getBoard");
        boolean taskToDoListExists = contex.containsBean("taskToDoList");
        boolean taskInProgressListExists = contex.containsBean("taskInProgressList");
        boolean taskDoneListExists = contex.containsBean("taskDoneList");

        //Then
        System.out.println("Bean getBoard was found in the container: " + boardExists);
        System.out.println("Bean taskToDoList was found in the container: " + taskToDoListExists);
        System.out.println("Bean taskInProgressList was found in the container: " + taskInProgressListExists);
        System.out.println("Bean taskDoneList was found in the container: " + taskDoneListExists);

        Assert.assertTrue(boardExists);
        Assert.assertTrue(taskToDoListExists);
        Assert.assertTrue(taskInProgressListExists);
        Assert.assertTrue(taskDoneListExists);
    }

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When
        Board board = (Board)context.getBean("getBoard");

        ArrayList<String> taskToDoList = (ArrayList<String>)board.getToDoList().getTasks();
        taskToDoList.add("Task To Do list");

        ArrayList<String> taskInProgressList = (ArrayList<String>)board.getInProgressList().getTasks();
        taskInProgressList.add("Task in progress list");

        ArrayList<String> taskDoneList = (ArrayList<String>)board.getDoneList().getTasks();
        taskDoneList.add("Task done list");

        //Then
        Assert.assertEquals("Task To Do list", taskToDoList.get(0));
        Assert.assertEquals("Task in progress list", taskInProgressList.get(0));
        Assert.assertEquals("Task done list", taskDoneList.get(0));
    }
}
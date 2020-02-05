package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverMentor {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void notifyAboutNewTask(StudentTasks studentTasks) {
        System.out.println("Hi, " + name + "! Your student " + studentTasks.getStudent().getName() +
                " has already solved exercise: " + studentTasks.getExercises().peekLast() +
                ". Total amount of exercises done by him: " + studentTasks.getExercises().size());
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}

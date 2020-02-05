package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StudentTasks implements ObservableQueue {
    private final Student student;
    private final Deque<String> exercises;
    private final List<ObserverMentor> observers;

    public StudentTasks(Student student) {
        this.student = student;
        exercises = new ArrayDeque<>();
        observers = new ArrayList<>();
    }

    public void addTaskToQueue(String task) {
        exercises.offerLast(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverMentor observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverMentor observer : observers) {
            observer.notifyAboutNewTask(this);
        }
    }

    @Override
    public void removeObserver(ObserverMentor observer) {
        observers.remove(observer);
    }

    public Student getStudent() {
        return student;
    }

    public Deque<String> getExercises() {
        return exercises;
    }
}

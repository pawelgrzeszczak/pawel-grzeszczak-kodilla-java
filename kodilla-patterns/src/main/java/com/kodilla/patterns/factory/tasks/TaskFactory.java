package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Driving Task", "kielce", "car");
            case PAINTING:
                return new PaintingTask("Painting Task", "blue", "wall");
            case SHOPPING:
                return new ShoppingTask("Shopping Task", "iPhone", 2.0);
            default:
                return null;
        }
    }
}

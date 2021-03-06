package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Tasks maketask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Trip, ", "Work, ", "Car");
            case PAINTING:
                return new PaintingTask("House, ", "white, ", "New house");
            case SHOPPING:
                return new ShoppingTask("Grocery shopping, ","fruit, ","25");
            default:
                return null;
        }
    }
}

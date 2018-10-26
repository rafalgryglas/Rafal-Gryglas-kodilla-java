package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("breakfast", "cheese", 2);
            case DRIVINGTASK:
                return new DrivingTask("Go to Pub", "Highlander Whisky Bar", "TAXI");
            case PAINTINGTASK:
                return new PaintingTask("Painting", "white", "wood fence");
            default:
                return null;
        }
    }
}

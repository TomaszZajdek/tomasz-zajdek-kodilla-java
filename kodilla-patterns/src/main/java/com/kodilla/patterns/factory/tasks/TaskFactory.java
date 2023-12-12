package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
   public static final String DRIVING_TASK = "DRIVING";
    public static final String PAINTING_TASK = "PAINTING";
    public static final String SHOPPING_TASK = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case DRIVING_TASK -> new DrivingTask("Driver01", "address", "like you wish");
            case PAINTING_TASK -> new PaintingTask("Painting", "white", "wall");
            case SHOPPING_TASK -> new ShoppingTask("Buy", "Banana", 10);
            default -> null;
        };
    }
}

package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TaskFactoryTestSuite {
    @Test
    void testFactoryShoppingTask() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING_TASK);
        shoppingTask.executeTask();

        // Then
        assertEquals("Buy", shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING_TASK);
        paintingTask.executeTask();

        // Then
        assertEquals("Painting", paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted());

    }

    @Test
    void testFactoryDrivingTask() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING_TASK);
        drivingTask.executeTask();

        // Then
        assertEquals("Driver01", drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());

    }

}

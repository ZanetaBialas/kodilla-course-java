package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryDrivingtask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Tasks drivingTask = taskFactory.maketask(TaskFactory.DRIVING);
        boolean firstTask = drivingTask.isTaskExecuted();
        drivingTask.executeTask();
        //Then
        assertEquals("Trip, ", drivingTask.getTaskName());
        assertFalse(firstTask);
        assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Tasks paintingTask = taskFactory.maketask(TaskFactory.PAINTING);
        boolean firsttask = paintingTask.isTaskExecuted();
        paintingTask.executeTask();
        //Then
        assertEquals("House, ", paintingTask.getTaskName());
        assertFalse(firsttask);
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Tasks shoppingTask = taskFactory.maketask(TaskFactory.SHOPPING);
        boolean firstTask = shoppingTask.isTaskExecuted();
        shoppingTask.executeTask();
        //Then
        assertEquals("Grocery shopping, ", shoppingTask.getTaskName());
        assertFalse(firstTask);
        assertTrue(shoppingTask.isTaskExecuted());
    }
}

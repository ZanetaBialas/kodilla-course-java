package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD: Forum Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    @BeforeAll
    public static void beforeAllTest() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(3);
        //when
        shapeCollector.addFigure(shape);
        //Then
        Assertions.assertEquals(1, shapeCollector.getShapeCollector().size());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(3);
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, shapeCollector.getShapeCollector().size());
    }
    @Test
    public void testRemoveFigureWhichDoesNotExist() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(10));
        //When
        boolean result = shapeCollector.removeFigure(new Circle(3));
        //Then
        Assertions.assertFalse(result);
        Assertions.assertEquals(1, shapeCollector.getShapeCollector().size());
    }

    @Test
    public void testShowTheFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(10);
        shapeCollector.addFigure(shape);
        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(shape);
        //When
        List<Shape> shapeResult = shapeCollector.getShapeCollector();
        //Then
        Assertions.assertEquals(shapeList.toString(), shapeResult.toString());
    }
}



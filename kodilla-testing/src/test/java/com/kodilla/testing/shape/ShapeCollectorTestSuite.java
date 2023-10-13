package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Shape Collector Test Suite \uD83D\uDE31")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for add and remove shapes")
    class AddAndRemoveTest {
        @Test
        @DisplayName("Adding shape")
        void addFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Square(10);

            // When
            shapeCollector.addFigure(shape1);

            // Then
            Assertions.assertEquals(1, shapeCollector.shapes.size());
        }

        @Test
        @DisplayName("Removing shape from collection")
        void removeFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Square(10);
            shapeCollector.addFigure(shape1);

            // When
            shapeCollector.removeFigure(shape1);

            // Then
            Assertions.assertEquals(0, shapeCollector.shapes.size());
        }
    }

    @Nested
    @DisplayName("Test for get and show shapes")
    class GetAndShowTests {
        @Test
        @DisplayName("Geting figure from collection")
        void getFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Square(10);
            shapeCollector.addFigure(shape1);

            // When
            Shape shapeFromGetFigureMethod = shapeCollector.getFigure(0);

            // Then
            Assertions.assertEquals("Square", shapeFromGetFigureMethod.getShapeName());
        }

        @Test
        @DisplayName("Showin all figures")
        void showFigures() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Square(10);
            Shape shape2 = new Circle(5);
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);

            // When
            String allFigures = shapeCollector.showFigures();

            // Then
            Assertions.assertEquals("Square, Circle", allFigures);
        }
    }
}
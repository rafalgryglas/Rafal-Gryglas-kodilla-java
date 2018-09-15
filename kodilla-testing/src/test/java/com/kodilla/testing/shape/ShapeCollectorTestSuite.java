package com.kodilla.testing.shape;

import org.junit.*;
import static org.junit.Assert.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTest() {
        System.out.println("Test Shape Collector begin");
    }
    @AfterClass
    public static void afterAllTest() {
        System.out.println("End all tests");
    }
    @Before
    public void beforeTest() {
        testCounter++;
        System.out.println("Preparing test # " + testCounter);
    }
    @Test
    public void testAddAndGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(5);
        //When
        shapeCollector.addFigure(shape);
        Shape takenFigure = shapeCollector.getFigure(0);
        //Then
           assertEquals(shape, takenFigure);
       }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(5);
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        assertTrue(result);
        assertEquals(0,shapeCollector.shapsCount());
    }
}

package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeCollector = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeCollector.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapeCollector.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapeCollector.get(n);
    }

    public int shapsCount() {
        return shapeCollector.size();
    }
}

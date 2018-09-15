package com.kodilla.testing.shape;

import java.util.Objects;

import static java.lang.Math.PI;

public class Circle implements Shape {
    private String shapeName;
    private double radius;

    public Circle(double radius) {
        this.shapeName = "Circle";
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Objects.equals(shapeName, circle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, radius);
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return radius * radius * PI;
    }
}

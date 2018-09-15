package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private String shapeName;
    private double baseOfTriangle;
    private double heightOfTriangle;

    public Triangle(double baseOfTriangle, double heightOfTriangle) {
        this.shapeName = "Triangle";
        this.baseOfTriangle = baseOfTriangle;
        this.heightOfTriangle = heightOfTriangle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.baseOfTriangle, baseOfTriangle) == 0 &&
                Double.compare(triangle.heightOfTriangle, heightOfTriangle) == 0 &&
                Objects.equals(shapeName, triangle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, baseOfTriangle, heightOfTriangle);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeName='" + shapeName + '\'' +
                ", baseOfTriangle=" + baseOfTriangle +
                ", heightOfTriangle=" + heightOfTriangle +
                '}';
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return baseOfTriangle * heightOfTriangle * 0.5;
    }
}

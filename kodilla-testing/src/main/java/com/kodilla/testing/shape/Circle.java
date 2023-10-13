package com.kodilla.testing.shape;

public class Circle implements Shape{
    public Circle(double radius) {
        this.radius = radius;
    }

    private double radius;
    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return Math.PI * radius * radius;
    }
}

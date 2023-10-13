package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double baseLenght;
    private double height;

    public Triangle(double baseLenght, double height) {
        this.baseLenght = baseLenght;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return (baseLenght * height) / 2;
    }
}

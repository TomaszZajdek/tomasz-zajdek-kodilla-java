package com.kodilla.testing.shape;

public class Square implements  Shape{
    public Square(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    private double sideLenght;


    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return sideLenght * sideLenght;
    }
}

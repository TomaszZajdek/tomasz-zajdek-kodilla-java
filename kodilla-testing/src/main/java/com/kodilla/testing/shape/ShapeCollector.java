package com.kodilla.testing.shape;

import java.util.List;
import java.util.ArrayList;

public class ShapeCollector {
    List<Shape> shapes = new ArrayList<>();
    public void addFigure(Shape shape) {
        shapes.add(shape);
    }
    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }
    public Shape getFigure(int n) {
        if(shapes.size() > 0 && n >= 0 && n < shapes.size()) {
            return shapes.get(n);
        } return null;
    }
    public String showFigures() {
        if(shapes.size() > 0) {
            StringBuilder allFigures = new StringBuilder();
            for(int i = 0; i < shapes.size(); i++) {
                allFigures.append(shapes.get(i).getShapeName()).append(", ");
            }
            allFigures.setLength(allFigures.length()-2);
            String result = allFigures.toString();
            return result;
        }
        return null;
    }
}

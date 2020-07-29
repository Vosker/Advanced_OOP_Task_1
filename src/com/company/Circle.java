package com.company;

public class Circle extends Shape {

    public Circle(String color, double area, String nameOfTHeShape) {
        super(color, area, nameOfTHeShape);
    }

    private double getRadiusSize() {
        return Math.sqrt(getArea() / Math.PI);
    }

    @Override
    public String toString() {
        return ", radius size: " + df.format(getRadiusSize());
    }
}

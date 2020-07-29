package com.company;

public class Circle extends Shape {

    public Circle(String color, double area) {
        super(color, area);
    }

    private double getRadiusSize() {
        return Math.sqrt(getArea() / Math.PI);
    }

    @Override
    public String toString() {
        return "Shape: Circle, color: " +
                getColor() +
                ", area = " + getClass() +
                ", radius size: " + df.format(getRadiusSize());
    }
}

package com.company;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius, String nameOfTHeShape) {
        super(color, nameOfTHeShape);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    private double getCircleArea() {
        return Math.pow(getRadius(), 2);
    }


    @Override
    public String toString() {
        return only2DigitsAfterDot.format(getCircleArea()) +
                ", radius size: " + only2DigitsAfterDot.format(getRadius());
    }
}

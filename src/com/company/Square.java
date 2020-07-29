package com.company;

public class Square extends Shape {

    public Square(String color, double area, String nameOfTHeShape) {
        super(color, area, nameOfTHeShape);
    }

    private double getSquareSideSize() {
        return Math.sqrt(getArea());
    }

    @Override
    public String toString() {
        return ", side size: " + df.format(getSquareSideSize());
    }
}


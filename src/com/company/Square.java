package com.company;

public class Square extends Shape {

    public Square(String color, double area) {
        super(color, area);
    }

    private double getSquareSideSize() {
        return Math.sqrt(getArea());
    }

    @Override
    public String toString() {
        return "Shape: Square, color: " +
                getColor() +
                ", area = " + getArea() +
                ", side size: " + df.format(getSquareSideSize());
    }
}


package com.company;

public class Square extends Shape {
    private double side;

    public Square(String color, double side, String nameOfTHeShape) {
        super(color, nameOfTHeShape);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    private double getSquareArea() {
        return getSide()*getSide();
    }

    @Override
    public String toString() {
        return only2DigitsAfterDot.format(getSquareArea()) +
                ", side size: " + only2DigitsAfterDot.format(getSide());
    }
}


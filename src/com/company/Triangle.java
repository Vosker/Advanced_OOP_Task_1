package com.company;

public class Triangle extends Shape {
    private double leg1;
    private double leg2;

    public Triangle(String color, double leg1, double leg2, String nameOfTHeShape) {
        super(color, nameOfTHeShape);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    public void setFirstLeg(double firstLeg) {
        this.leg1 = firstLeg;
    }

    public double getLeg1() {
        return leg1;
    }

    public double getLeg2() {
        return leg2;
    }

    private double getHypotenuseSize() {
        return Math.sqrt(Math.pow(getLeg1(), 2) + Math.pow(getLeg2(), 2));
    }

    private double getTriangleArea() {
        return getLeg1() * getLeg2() / 2;
    }

    @Override
    public String toString() {
        return only2DigitsAfterDot.format(getTriangleArea()) +
                ", hypotenuse size: " + only2DigitsAfterDot.format(getHypotenuseSize());
    }
}

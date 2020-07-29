package com.company;

public class Trapezoid extends Shape {
    private double sidesAverage;
    private double height;

    public Trapezoid(String color, double height, double sidesAverage, String nameOfTHeShape) {
        super(color, nameOfTHeShape);
        this.sidesAverage = sidesAverage;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getSidesAverage() {
        return sidesAverage;
    }

    public void setSidesAverage(double sidesAverage) {
        this.sidesAverage = sidesAverage;
    }

    private double getTrapezoidArea() {
        return (getSidesAverage()) / 2 * getHeight();
    }

    @Override
    public String toString() {
        return only2DigitsAfterDot.format(getTrapezoidArea()) +
                ", trapezoid height size: " + only2DigitsAfterDot.format(getHeight());
    }
}

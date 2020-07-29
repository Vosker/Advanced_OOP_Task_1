package com.company;

public class Trapezoid extends Shape {
    private double upperSide, lowerSide;

    public Trapezoid(String color, double area, double upperSide, double lowerSide, String nameOfTHeShape) {
        super(color, area, nameOfTHeShape);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
    }

    public double getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(double upperSide) {
        this.upperSide = upperSide;
    }

    public double getLowerSide() {
        return lowerSide;
    }

    public void setLowerSide(double lowerSide) {
        this.lowerSide = lowerSide;
    }

    private double getTrapezoidHeight() {
        return getArea() * 2 / (getLowerSide() + getUpperSide());
    }

    @Override
    public String toString() {
        return ", trapezoid height size: " + df.format(getTrapezoidHeight());
    }
}

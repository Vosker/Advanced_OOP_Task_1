package com.company;

public class Trapezoid extends Shape {
    double upperSide, lowerSide;

    public Trapezoid(String color, double area, double upperSide, double lowerSide) {
        super(color, area);
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
        return "Shape: Trapezoid, color: " +
                color +
                ", area = " + area +
                ", trapezoid height size: " + df.format(getTrapezoidHeight());
    }
}

package com.company;

public class Triangle extends Shape {
    double Leg;

    public Triangle(String color, double area, double Leg) {
        super(color, area);
        this.Leg = Leg;
    }

    public double getFirstLeg() {
        return Leg;
    }

    public void setFirstLeg(double firstLeg) {
        this.Leg = firstLeg;
    }

    private double getSecondLeg() {
        return getArea() * 2 / getFirstLeg();
    }

    private double getHypotenuseSize() {
        return Math.sqrt(Math.pow(getFirstLeg(), 2) + Math.pow(getSecondLeg(), 2));
    }

    @Override
    public String toString() {
        return "Shape: Triangle, color: " +
                color +
                ", area = " + area +
                ", hypotenuse size: " + df.format(getHypotenuseSize());
    }
}

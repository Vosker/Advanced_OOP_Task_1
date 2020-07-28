package com.company;

public class Square extends Shape {
    double sizeSide;

    public Square(String color, double sizeSide) {
        super(color);
        this.sizeSide = sizeSide;
    }

    public double getSizeSide() {
        return sizeSide;
    }

    public void setSizeSide(double sizeSide) {
        this.sizeSide = sizeSide;
    }

    @Override
    public double getArea() {
        return getSizeSide()*getSizeSide();
    }

    @Override
    public String toString() {
        return "Square{" +
                "sizeSide=" + getArea() +
                ", color='" + color + '\'' +
                '}';
    }
}

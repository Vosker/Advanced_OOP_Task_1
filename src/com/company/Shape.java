package com.company;

import java.text.DecimalFormat;

public class Shape {
    private String color;
    private String nameOfTheShape;
    public DecimalFormat only2DigitsAfterDot = new DecimalFormat("0.00");

    public Shape(String color, String nameOfTHeShape) {
        this.color = color;
        this.nameOfTheShape = nameOfTHeShape;
    }

    public String getNameOfTheShape() {
        return nameOfTheShape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Shape: " + getNameOfTheShape() +
                ", color: " + getColor() +
                ", area = " + toString());
    }
}

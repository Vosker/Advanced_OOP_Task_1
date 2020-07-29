package com.company;

import java.text.DecimalFormat;

public class Shape {
    private String color;
    private double area;
    private String nameOfTheShape;
    DecimalFormat df = new DecimalFormat("0.00");

    public Shape(String color, double area, String nameOfTHeShape) {
        this.color = color;
        this.area = area;
        this.nameOfTheShape = nameOfTHeShape;
    }

    public String getNameOfTheShape() {
        return nameOfTheShape;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Shape: " + getNameOfTheShape()
                + ", color: " + getColor() +
                ", area = " + getArea() + toString());
    }
}

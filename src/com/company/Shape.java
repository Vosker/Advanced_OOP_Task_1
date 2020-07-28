package com.company;

import java.text.DecimalFormat;

public class Shape {
    String color;
    double area;
    DecimalFormat df = new DecimalFormat("0.00");

    public Shape(String color, double area) {
        this.color = color;
        this.area = area;
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
        System.out.println(toString());
    }
}

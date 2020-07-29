package com.company;

public class DrawFigures {
    public static void main(String[] args) {
        int amountOfShapes = (int) (Math.random() * 10 + 1);
        for (int i = 0; i < amountOfShapes; i++) {
            int shapeNumber = (int) (Math.random() * 4);
            switch (shapeNumber) {
                case 0: {
                    Shape square = new Square(randomColor(), randomNumber(), "Square");
                    square.draw();
                    break;
                }
                case 1: {
                    Shape circle = new Circle(randomColor(), randomNumber(), "Circle");
                    circle.draw();
                    break;
                }
                case 2: {
                    Shape triangle = new Triangle(randomColor(), randomNumber(), randomNumber(), "Triangle");
                    triangle.draw();
                    break;
                }
                case 3: {
                    Shape trapezoid = new Trapezoid(randomColor(), randomNumber(), randomNumber(), "Trapezoid");
                    trapezoid.draw();
                    break;
                }
            }
        }
    }

    public static String randomColor() {
        int randomizer = (int) (Math.random() * 4);
        switch (randomizer) {
            case 0:
                return Color.GREEN.name();
            case 1:
                return Color.RED.name();
            case 2:
                return Color.BLUE.name();
            case 3:
                return Color.BLACK.name();
            default:
                return "White";
        }
    }

    public static double randomNumber() {
        return Math.random() * 100;
    }
}

package com.company;

import java.text.DecimalFormat;

public class DrawFigures {
    public static void main(String[] args) {
        String[] availableColors = {"Green", "Blue", "Red", "Fioletoviy_Pizdec"};
//        Square square = new Square(availableColors[0],25);
//        Circle circle = new Circle(availableColors[1], 25);
//        Triangle triangle = new Triangle(availableColors[2],25,4);
//        Trapezoid trapezoid = new Trapezoid(availableColors[3],30,7,2);
        int amountOfShapes = (int) (Math.random() * 10);
        for (int i = 0; i < amountOfShapes; i++) {
            int shapeNumber = (int) (Math.random() * 4);
            switch (shapeNumber) {
                case 0: {
                    Square square = new Square(availableColors[(int) (Math.random() * 3)], Math.random() * 100);
                    square.draw();
                    break;
                }
                case 1: {
                    Circle circle = new Circle(availableColors[(int) (Math.random() * 3)], Math.random() * 100);
                    circle.draw();
                    break;
                }
                case 2: {
                    Triangle triangle = new Triangle(availableColors[(int) (Math.random() * 3)], Math.random() * 100, Math.random() * 30);
                    triangle.draw();
                    break;
                }
                case 3: {
                    Trapezoid trapezoid = new Trapezoid(availableColors[(int) (Math.random() * 3)], Math.random() * 100, Math.random() * 20, Math.random() * 40);
                    trapezoid.draw();
                    break;
                }
                default:
                    break;
            }
        }
//       square.draw();
//       triangle.draw();
//       circle.draw();
//       trapezoid.draw();
    }

}

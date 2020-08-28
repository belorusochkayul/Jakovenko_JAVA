package by.kiparo;

import java.util.Scanner;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getSquare() {
        return (Math.PI * enterRadious());
    }

    public static double enterRadious() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius value: ");
        double radius = sc.nextDouble();
        return (radius * radius);

    }
}
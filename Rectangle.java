package by.kiparo;

import java.util.Scanner;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Rectangle";
    }

    @Override
    public double getSquare() {
        return (enterWidth() * enterHeight());
    }

    public static double enterWidth() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter width size: ");
        double width = sc.nextDouble();
        return (width);
    }

    public static double enterHeight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter height size: ");
        double height = sc.nextDouble();
        return (height);
    }
}

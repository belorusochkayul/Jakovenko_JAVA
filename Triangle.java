package by.kiparo;

import java.util.Scanner;

public class Triangle extends Shape {
    private double firstSide;
    private double secondSide;
    private double angle;

    public Triangle(double firstSide, double secondSide, double angle) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.angle = angle;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getSquare() {
        return ((firstSide() * secondSide() * Math.sin(Math.toRadians(enterAngle()))) / 2);
    }

    public static double firstSide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter firstSide size: ");
        double firstSide = sc.nextDouble();
        return (firstSide);
    }

    public static double secondSide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter secondSide size: ");
        double secondSide = sc.nextDouble();
        return (secondSide);
    }

    public static double enterAngle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter angle value in degrees: ");
        double angle = sc.nextDouble();
        return (angle);
    }
}


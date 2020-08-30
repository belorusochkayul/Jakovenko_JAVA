package by.kiparo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        switch (figureSelection()) {
            case 1:
                Rectangle rectangle = new Rectangle(3, 4);
                printInfo(rectangle);
                break;
            case 2:
                Square square = new Square(7);
                printInfo(square);
                break;
            case 3:
                Circle circle = new Circle(4);
                printInfo(circle);
                break;
            case 4:
                Triangle triangle = new Triangle(2, 3, 30);
                printInfo(triangle);
                break;
            default:
                System.out.println("default");
        }
    }

    public static void printInfo(Shape shape) {
        shape.printInfo();
    }

    public static int figureSelection() {
        Scanner sc = new Scanner(System.in);
        System.out.println("выберите фигуру: 1 - прямоугольник, 2 - квадрат, 3 - круг, 4 - треугольник");
        int number = sc.nextInt();
        return (number);
    }

    public static double enterRadious() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius value: ");
        double radius = sc.nextDouble();
        return (radius * radius);
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

    public static double sideSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter side size: ");
        double sideSize = sc.nextDouble();
        return (sideSize * sideSize);
    }
}
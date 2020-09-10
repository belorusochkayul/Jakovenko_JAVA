package by.kiparo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shape shape = null;

        switch (figureSelection()) {
            case 1:
                shape = new Rectangle(enterWidth(), enterHeight());
                break;
            case 2:
                shape = new Square(sideSize());
                break;
            case 3:
                shape = new Circle(enterRadious());
                break;
            case 4:
                shape = new Triangle(firstSide(),secondSide(),enterAngle());
                break;
            default:
                System.out.println("default");
        }
        if (shape != null) {
            printInfo(shape);
        } else {
            System.out.println("вы не выбрали фигуру");
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
        return (radius);
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
        return (sideSize);
    }
}
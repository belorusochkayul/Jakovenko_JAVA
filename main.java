package by.kiparo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        switch (figureSelection()) {
            case 1:
                Rectangle rectangle = new Rectangle(Rectangle.enterWidth(), Rectangle.enterHeight());
                printInfo(rectangle);
                break;
            case 2:
                Square square = new Square(12, 12);
                printInfo(square);
                break;
            case 3:
                Circle circle = new Circle(Circle.enterRadious());
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
}

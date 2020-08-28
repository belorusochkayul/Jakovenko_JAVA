package by.kiparo;


public abstract class Shape {

    public abstract String getShapeName();

    public abstract double getSquare();

    public void printInfo() {
        System.out.println("Исследуемая фигура: " + getShapeName() + ", ее площадь: " + getSquare() + " см^2");
    }
}

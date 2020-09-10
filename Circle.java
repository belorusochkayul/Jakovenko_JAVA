package by.kiparo;

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
        return (Math.PI * radius * radius);
    }

    public double setRadius(double radius) {
        return radius;
    }
}
package by.kiparo;

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
        return (Main.enterWidth() * Main.enterHeight());
    }

    public double setWidth(double width) {
        return width;
    }

    public double setHeight(double height) {
        return height;
    }
}
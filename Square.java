package by.kiparo;

public class Square extends Shape {
    private double sideSize;


    public Square(double sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getSquare() {
        return (setSideSize(Main.sideSize()));
    }

    public double setSideSize(double sideSize) {
        return sideSize;
    }
}
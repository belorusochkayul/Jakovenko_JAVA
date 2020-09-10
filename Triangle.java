package by.kiparo;

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
        return ((firstSide * secondSide * Math.sin(Math.toRadians(angle))) / 2);
    }

    public double setFirstSide(double firstSide) {
        return firstSide;
    }

    public double setSecondSide(double secondSide) {
        return secondSide;
    }

    public double getAngle(double angle) {
        return angle;
    }
}
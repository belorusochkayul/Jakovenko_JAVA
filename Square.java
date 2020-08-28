package by.kiparo;

public class Square extends Rectangle {
    public Square(double width, double height) {
        super(width, height);
    }

    @Override
    public String getShapeName() {
        return "Square";
    }
}


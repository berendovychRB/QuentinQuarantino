package task2;

public class Rectangle implements Figure {

    private int length;
    private String color;

    public Rectangle(int length, String color) {
        this.length = length;
        this.color = color;
    }

    @Override
    public Double getArea() {
        return Double.valueOf(length * length);
    }

    @Override
    public String getColor() {
        return "Rectangle's color is " + color;
    }

    @Override
    public String getShape() {
        return "This is Rectangle";
    }
}

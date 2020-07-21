package task1;

public class Circle implements Figure {

    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    @Override
    public Double getArea() {
        return 3.14 * (radius * radius);
    }

    @Override
    public String getColor() {
        return "Circle's color is " + color;
    }

    @Override
    public String getShape() {
        return "This is Circle";
    }
}

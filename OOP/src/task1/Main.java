package task1;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5,"blue");
        double circleArea = circle.getArea();
        System.out.println("Circle's area is " + circleArea);
        System.out.println(circle.getColor());
        System.out.println(circle.getShape());

        System.out.println();

        Rectangle rectangle = new Rectangle(7,"yellow");
        double rectangleArea = rectangle.getArea();
        System.out.println("Rectangle's area is " + rectangleArea);
        System.out.println(rectangle.getColor());
        System.out.println(rectangle.getShape());
    }

}

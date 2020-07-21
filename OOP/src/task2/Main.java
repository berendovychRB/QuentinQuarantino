package task2;

public class Main {

    public static void main(String[] args) {

        Figure figure1 = new Circle(5,"blue");
        Figure figure2 = new Rectangle(7,"yellow");

        Figure[] figures = {figure1, figure2};

        for(Figure figure : figures){
            System.out.println(figure.getShape());
            System.out.println("Figure's Area is " + figure.getArea());
            System.out.println(figure.getColor());
            System.out.println();
        }


    }

}

package task3;

public class Fibonacci {

    public static void main(String[] args) {

        int[] arr = new int[8];
        int a = 1;
        int b = 1;
        int c;

        System.out.print("Fibonacci's numbers: " + a + " " + b +  " ");

        for(int i = 0; i < arr.length; i++){

            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }

    }
}

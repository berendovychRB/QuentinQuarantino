package task2;

public class NumberArray {

    public static void main(String[] args) {

        int[] numbers = {14, 876, 89, 35, 36, 874, 234, 223, 156, 77, 9};
        int count = 0;


        for(int i = 0; i < numbers.length; i++){

            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            } else {
                count++;
            }
        }

        System.out.println("There are " + count + " odd numbers.");

    }

}

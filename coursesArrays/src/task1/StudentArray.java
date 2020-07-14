package task1;

public class StudentArray {

    public static void main(String[] args) {

        int[] studentsAge = {14, 16, 28, 34, 25, 23, 17, 18, 22};
        int count = 0;


        for(int i = 0; i < studentsAge.length; i++) {

            if (studentsAge[i] >= 18) {
                System.out.println("Your age is " + studentsAge[i] + ".And you are adult.");
                count++;
            }

        }
        System.out.println("Number of adult students is " + count);

    }

}

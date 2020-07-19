package task3_4_5;

public class IndexOfArray {

    public static void main(String[] args) {

        int[] numbers = {12,2,11,30,4432,33,41,678,35,234,6876,32,331,7753,463,87,54,23,124,765};
        int sum = 0;
        float averageValue;

        System.out.println("Indexes of pair numbers: ");
        for(int i : numbers){
            if (i % 2 == 0){
                System.out.print(i + ", ");
            }
            sum += i;
        }

        averageValue = sum / numbers.length;
        System.out.println("\nAverage Value is " + averageValue);

        System.out.println("Numbers which are aliquot 2/3/5:");
        for(int i : numbers) {
            if(i % 2 == 0
               && i % 3 == 0
               && i % 5 == 0){
                System.out.print(i + ", ");
            }
        }
    }

}

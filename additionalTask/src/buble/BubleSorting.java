package buble;

public class BubleSorting {

    public static void main(String[] args) {

        int[] arr = {123, 11, 51512, 512, 12, 723, 736, 7, 612, 6772, 32, 5675, 123, 723, 123};
        int mid;

        System.out.print("Normal array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    mid = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = mid;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

}

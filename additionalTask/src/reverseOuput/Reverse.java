package reverseOuput;

public class Reverse {

    public static void main(String[] args) {

        String[] names = {"Clinton", "Sarah", "Carl", "Jack", "Vasyl", "Ulyana", "Rishabh", "Desmond"};
        System.out.print("Names: ");
        for (int i = 0; i < names.length; i++){
            System.out.print(names[i] + " ");
        }
        System.out.println();
        System.out.print("Reverse: ");
        for (int i = names.length - 1; i >= 0; i-- ){
            System.out.print(names[i] + " ");
        }
    }

}

package doubleArray;

public class DoubleInFloat {

    public static void main(String[] args) {

        double[] dArray = {123.12, 47.51, 6233.88, 6323.6, 952.12452, 234.522, 512893.211, 633.52};
        int count = 0;

        for (int i = 0; i < dArray.length; i++) {
            if (dArray[i] > 1111.31) {
                count++;
            }
        }

        float[] fArray = new float[count];
        int pos = 0;

        for (int i = 0; i < dArray.length; i++) {
            if (dArray[i] > 1111.31) {
                fArray[pos] = (float) dArray[i];
                pos++;
            }
        }

        System.out.print("Double array: ");
        for (int i = 0; i < dArray.length; i++) {
            System.out.print(dArray[i] + " ");
        }
        System.out.println();
        System.out.print("Float array: ");
        for (int i = 0; i < fArray.length; i++) {
            System.out.print(fArray[i] + " ");


        }
    }
}

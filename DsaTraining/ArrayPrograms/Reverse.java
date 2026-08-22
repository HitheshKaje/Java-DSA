import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {11, 14, 23, 13, 67, 32};
        int[] arr1 = new int[arr.length];
        int index=0;

        for (int i = arr.length-1; i >= 0; i--) {
            arr1[index] = arr[i];
            index++;
        }
            System.out.println(Arrays.toString(arr1));

    }
}

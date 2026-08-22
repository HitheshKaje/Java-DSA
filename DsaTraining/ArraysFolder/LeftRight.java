import java.util.Arrays;

public class LeftRight {
    public static void main(String[] args) {
        int[] arr = {10, 11, 34, 15, 16};
        System.out.println(Arrays.toString(arr));
        Left(arr);
        Left(arr);
        Right(arr);
        Right(arr);
        Right(arr);
        System.out.println(arr[0]);

    }
    public static void Left(int[]arr){
        int temp = arr[0];
        for (int i = 0; i <= arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;

    }

    public  static void Right(int []arr){
        int k=arr[arr.length-1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = k;
    }

}

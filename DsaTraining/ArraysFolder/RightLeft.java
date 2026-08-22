import java.util.Arrays;

public class RightLeft {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40,50};
        Left(arr);
        Left(arr);
        Right(arr);
        Right(arr);
        Right(arr);
        System.out.println(arr[3]);

        }



    static void Right(int[] arr) {
            for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
            }
            arr[0] = 0;


    }

    static void Left(int[] arr) {

            for (int i = 0; i <= arr.length - 2; i++) {
                arr[i] = arr[i + 1];

                arr[arr.length - 1] = 0;
        }
    }
}
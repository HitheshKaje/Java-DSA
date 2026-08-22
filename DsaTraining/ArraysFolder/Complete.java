import java.util.Arrays;

public class Complete {
    public static void main(String[] args) {
        int[] arr = {10, 11, 34, 15, 16};
        System.out.println(Arrays.toString(arr));
        Left(arr);
        Left(arr);
        Right(arr);
        LeftRotate(arr);
        LeftRotate(arr);
        LeftRotate(arr);
RightRotate(arr);
System.out.println(arr[2]);

    }


    static void Left(int[] arr) {

        for (int i = 0; i <= arr.length - 2; i++) {
            arr[i] = arr[i + 1];

            arr[arr.length - 1] = 0;
        }
    }

    static void Right(int[] arr) {
        int k = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = k;
    }

    static void RightRotate(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i <= arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }


    static void LeftRotate(int[] arr){
        int k=arr[arr.length-1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = k;
    }

}

import java.util.Arrays;

public class Left {
    public static void main(String[] args) {
        int[] arr = {10, 11, 34, 15, 16};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <=arr.length-2; i++) {
            arr[i ] = arr[i+1];
        }
        arr[arr.length-1]=0;
        System.out.println(Arrays.toString(arr));


    }
}

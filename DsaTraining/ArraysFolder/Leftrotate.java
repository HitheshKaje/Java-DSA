import java.util.Arrays;

 class RotateLeft {
    public static void main(String[] args) {
        int[] arr = {10, 11, 34, 15, 16};
        System.out.println(Arrays.toString(arr));
        int temp = arr[0];
        for (int i = 0; i <= arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}

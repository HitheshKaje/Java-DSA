import java.util.Arrays;

public class Zeros {
    public static void main(String[] args) {
        int[] arr = {10, 0, 20, 30, 0};
        System.out.println(Arrays.toString(arr));
        int index=0;
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[index] = arr[i];
                index++;
            }else{
                arr[i]=0;
            }

        }
        while (index<arr.length){
            arr[index]=0;
            index++;
        }
        System.out.println(Arrays.toString(arr));

    }
}

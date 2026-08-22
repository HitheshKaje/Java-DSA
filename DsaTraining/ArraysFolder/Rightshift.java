import java.util.Arrays;

public class Rightshift {
            public static void main(String[] args) {
                int[] arr = {10, 11, 34, 15, 16};
                for (int i = arr.length-1; i >0; i--) {
                    arr[i ] = arr[i-1];
                }
                arr[0]=0;
                System.out.println(Arrays.toString(arr));


            }
        }




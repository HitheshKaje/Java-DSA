import java.util.Arrays;

public class Reversear {
        public static void main(String[] args) {
            int[] arr = {11, 14, 23, 13, 67, 32};
            int start=0;
            int end=arr.length-1;

           while(start<end) {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;


            }
            System.out.println(Arrays.toString(arr));

        }
    }

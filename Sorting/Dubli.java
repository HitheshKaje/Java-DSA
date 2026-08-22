import java.util.Arrays;

public class Dubli {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(digit(nums));
    }


    static int digit(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int x=arr[i];
            if((Count(x))% 2==0)
                count++;
        }
return count;

        }
    static int Count(int n){
       int count=0;
               while (n!=0){
                   n=n/10;
                   count++;

               }
               return count;
        }





}
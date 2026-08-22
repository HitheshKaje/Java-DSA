import java.util.Arrays;

public class ADD {
    public static void main(String[] args){
         int []nums = {1,2,0,0};
         int k=34;
         System.out.println(Arrays.toString(addToArrayForm(nums,k)));

    }


    public static int[] addToArrayForm(int[] num, int k) {
        int number=0;
        int max=0;
        int s=0;
        for (int i=0;i<num.length;i++){
            number = number * 10 + num[i];
        }
       max= number+k;
        String str = String.valueOf(max);
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
             arr[i] = str.charAt(i) - '0';

}
        return arr;

}
}
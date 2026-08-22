public class Sum1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
            System.out.println(sum);
        double average=(double) sum/arr.length;
        System.out.println(average);
        }

}

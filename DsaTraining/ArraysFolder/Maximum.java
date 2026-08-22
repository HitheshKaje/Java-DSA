public class Maximum {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 90, 50, 60,10};
        int max = 0;
        for (int i = arr.length / 2; i < arr.length; i++) {
            if (arr[i] > max) {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}

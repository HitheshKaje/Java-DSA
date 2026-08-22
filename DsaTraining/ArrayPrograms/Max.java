public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8};
        int max = 0;
        int min = 999 ;//arr[999];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
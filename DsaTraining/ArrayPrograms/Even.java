public class Even {
    public static void main(String[] args) {
        int[] arr = {23,76,98,67};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

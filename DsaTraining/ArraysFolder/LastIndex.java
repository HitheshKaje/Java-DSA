public class LastIndex {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 10, 10};
        int n = 10;
        for (int i =arr.length-1; i >=0; i--) {

            if (arr[i] == n) {
                System.out.println(i);
                break;

            }
        }
    }
}

public class Searching {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 10, 10};
        int n = 20;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("The element "+arr[i]+" Present in the index "+i);
                break;
            }
        }
    }
}

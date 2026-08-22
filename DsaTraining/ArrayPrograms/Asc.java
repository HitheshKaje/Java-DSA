public class Asc {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5, 7, 8};
        int sum = 0;
        boolean isarray = false;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] > arr[i]) {
                System.out.println("Not ascenfing");
                return;
            }
        }

        System.out.println("The array is ascending");

    }
}
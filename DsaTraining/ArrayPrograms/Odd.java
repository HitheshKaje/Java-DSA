import java.util.Scanner;

public class Odd {

        public static void main(String[] args) {
            int[] arr = {2, 3, 4, 5, 6, 7};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

package src.com.hithesh;

public class Pattern2 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 1; i < n; i++) {
            for (j = 1; j <= n-i; j++) {
                System.out.print(" ");

            }
            for (j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

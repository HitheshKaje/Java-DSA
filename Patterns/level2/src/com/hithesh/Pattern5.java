package src.com.hithesh;

public class Pattern5 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

            for (i = n - 1; i >= 1; i--) {
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }


        }

}

//     1
//    12
//   123
//  1234
// 12345
public class Pattern7 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        for (i = 0; i < n; i++) {
            for (j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

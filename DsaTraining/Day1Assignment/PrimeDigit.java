import java.util.Scanner;

public class PrimeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int original = n;
        while (n != 0) {

            int last = n % 10;

            if (IsPrime(last)) {
                System.out.println(last);
            }

            n = n / 10;
        }
    }






        public static boolean IsPrime(int n) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                return true;
            } else return false;
        }
}

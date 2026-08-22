import java.util.Scanner;

public class Prime {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int start = sc.nextInt();
            int end=sc.nextInt();
            for (int i = start; i <= end; i++) {
                if (IsPrime(i)) {
                    System.out.println(i + " is a prime number");
                }
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



import java.util.Scanner;

public class PrimeInGiven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int last = n % 10;
            IsPrime(last);
            n=n/10;
        }

    }

    static void IsPrime(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(number + " is a prime number.");

        }

    }
}

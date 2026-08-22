import java.util.Scanner;

public class TwistedPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean num = IsPrime(n);
        if (num == true) {
            reverse(n);
        }else{
            System.out.println("Given number is not a prime number");
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

    public static void reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int last = n % 10;
            rev = rev * 10 + last;
            n = n / 10;
        }
        if(IsPrime(rev)){
            System.out.println("The given Numebrs is Twisted prime ");

        }else{
            System.out.println("Not a twisted prime");
        }
    }
}

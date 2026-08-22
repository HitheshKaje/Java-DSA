import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int rev = 0;
        while (n != 0) {
            int last = n % 10;
            rev = rev * 10 + last;
            n = n / 10;

        }
        if (rev == num) {
            System.out.println("Given number is a plaindrome");
        } else {
            System.out.println("Given number is not a plaindrome");
        }
    }
}

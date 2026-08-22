import java.util.Scanner;

public class Evens {
    public static void main(String[] args) {
        int rev = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        while (number > 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;


        }
        System.out.println("The reverse of the number is "+rev);
    }
}


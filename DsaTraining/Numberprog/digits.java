import java.util.Scanner;

public class digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        while (number > 0) {
            int digit = number % 10;
            System.out.println("The last digit of the number is: " + digit);
            number = number / 10;
        }
    }
    
}


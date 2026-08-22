import java.util.Scanner;
public class Cout {
        public static void main(String[] args) {
            int count=0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number:");
            int number = scanner.nextInt();
            while (number > 0) {
                int digit = number % 10;
                number = number / 10;
                count++;
            }
            System.out.println("Count is "+count);
        }

    }


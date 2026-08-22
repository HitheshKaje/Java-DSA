import java.util.Scanner;

import java.util.Scanner;
public class Even {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number:");
            int number = scanner.nextInt();
            while (number > 0) {
                int digit = number % 10;
                if(digit%2==0)
                    System.out.println(digit);
                number = number / 10;


        }

    }
}

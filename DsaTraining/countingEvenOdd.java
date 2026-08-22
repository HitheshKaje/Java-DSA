import java.util.Scanner;

public class countingEvenOdd {
    public static void main(String[] args) {
        int Ecount=0;
        int Ocount=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        while (number > 0) {
            int digit = number % 10;
            if(digit%2==0)
                Ecount++;

            else Ocount++;
            number = number / 10;


        }
        System.out.println("Even count is:"+Ecount);
        System.out.println("Odd count is:"+Ocount);

    }
}

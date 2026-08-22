import java.util.Scanner;

public class Happy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        while (sum != 1 && sum != 4) {
            sum = square(n);
            n=sum;


        }
        if (sum == 1) {
            System.out.println("Nuber is happyy");
        }
        if (sum == 4)
            System.out.println("Number Sad sad");
    }


    public static int square(int n) {
        int sum = 0;
        while (n != 0) {
            int last = n % 10;
            int sq=last*last;
            sum += sq;
            n = n / 10;

        }
        return sum;

    }
}

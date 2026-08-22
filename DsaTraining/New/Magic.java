import java.util.Scanner;

public class Magic {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int n = sc.nextInt();
            int sum = 0;
            while (sum <10 && sum ==1) {
                sum = Sum(n);
                n=sum;

            }
            if (sum == 1 && sum<9) {
                System.out.println("Nuber is a Magic Number");

            }
           else
                System.out.println("Number not a magic");
        }


        public static int Sum(int n) {
            int sum = 0;
            while (n != 0) {
                int last = n % 10;
                sum += last;
                n = n / 10;

            }
            return sum;

        }
    }

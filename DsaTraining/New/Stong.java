import java.util.Scanner;

public class Stong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int newnum=n;
        int sum = 0;
        while (n != 0) {
            int last = n % 10;
            sum += Fact(last);
            n=n/10;
        }
        if(newnum==sum){
            System.out.println("Its a Strong Number");
        }else{
            System.out.println("Not a strong number");
        }


    }

    static int Fact(int n) {

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        return fact;

    }
}
import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int newnum = n;
            int res=Neon(n);
        if (newnum == res) {
            System.out.println("Its a Neon Number");
        } else {
            System.out.println("Not a Neon number");
        }


    }

    static int Neon(int n) {
        int square=n*n;
        int sum=0;
        while(square!=0){
            int last=n%10;
            sum+=last;
            n=n/10;

        }
return  sum;

    }
}
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;
        if(org%3==0 && org%5==0){
            System.out.println("The numbers is FIzzbUZZ");
        }else System.out.println("Not a fizzbUZZ");
    }
}



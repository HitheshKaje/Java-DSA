import java.util.Scanner;

public class Buzz {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int org=n;
        int last=n%10;
        if(org%7==0 || last==7){
            System.out.println("The numbers is bUZZ");
        }else System.out.println("Not a buss");
    }
}
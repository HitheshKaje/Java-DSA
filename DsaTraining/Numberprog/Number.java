import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();


       String s= num%2== 0 ? "Even" : "odd";
       System.out.println(s);
        }
    }

//maximum digit in the given number
import java.util.Scanner;

public class Max {
    public static void main(String[] args){
        int max=0;
        int min=9;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        while(n!=0){
            int digit=n%10;
            if(max<digit){
                max=digit;
            }
            if(min>=digit){
                min=digit;
            }
            n=n/10;


        }
        System.out.println("Maximum element is "+max);
        System.out.println("Maximum element is "+min);
    }
}

import java.util.Scanner;

public class Fact {
    public static void main(String[] args){
        int fact=1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        System.out.println(fact);
    }

}

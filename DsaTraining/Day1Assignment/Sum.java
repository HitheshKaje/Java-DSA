import java.util.Scanner;

public class Sum {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sum=Sum(n);
        System.out.println(sum);


    }
    static int Sum(int n){
        int sum=0;
        while (n!=0){
            int last=n%10;
            sum+=last;
            n=n/10;
        }
        return sum;
    }
}

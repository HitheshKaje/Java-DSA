import java.util.Scanner;

public class Fact {
    static int fact(int n){
        int sum=1;
        for(int i=1;i<=n;i++) {
            sum = sum * i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=fact(n);
        System.out.printf("The factorial of %d is %d ",n,res);
    }
}

import java.util.Scanner;

public class Spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = Sum(n);
        int product = Product(n);
        if(sum==product){
            System.out.println("Spy number");
        }else{
            System.out.println("Not a spy");
        }

    }

public static  int Sum(int n){
        int last;
        int sum=0;
        while (n!=0){
            last =n%10;
            sum+=last;
            n=n/10;

        }
        return  sum;

}
    public static int Product(int n){
        int last;
        int product=1;
        while (n!=0){
            last =n%10;
            product*=last;
            n=n/10;

        }
        return  product;

    }

}


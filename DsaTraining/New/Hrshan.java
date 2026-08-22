import java.util.Scanner;

public class Hrshan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int original = n;
        int sum=Sum(n);
        if(original%sum==0){
            System.out.println("The number is harshad");
        }else{
            System.out.println("Not harshad number");
        }
    }



    static int Sum(int n){
        int sum=0;
        while(n!=0){
            int last=n%10;
            sum+=last;
            n=n/10;

        }
        return sum;
    }

}

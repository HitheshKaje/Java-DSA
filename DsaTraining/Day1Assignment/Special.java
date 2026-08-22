import java.util.Scanner;

public class Special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int org = n;
        int res = Sum(  n);
        int prod = Product( n);
        int f=res+prod;
        if(org==f){
            System.out.println("The Number is  Special type");
        }else System.out.println("Not a twodigit special ");
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

    static int Product(int n){
        int prod=1;
        while (n!=0){
            int last=n%10;
            prod*=last;
            n=n/10;
        }
        return prod;
    }


}

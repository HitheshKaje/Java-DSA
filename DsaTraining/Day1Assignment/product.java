import java.util.Scanner;

public class product {
        public static void main(String[]args){
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            int prod=Product(n);
            System.out.println(prod);


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



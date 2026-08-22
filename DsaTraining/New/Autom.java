import java.util.Scanner;

public class Autom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int org=n;
        int sq=Square(n);
        int lastorg=0;
        int lastsq=0;
        while(org!=0){
             lastorg=org%10;
             lastsq=sq%10;
             if(lastorg!=lastsq){
                 System.out.println("Not a automan Number");
                 return;
             }
             org=org/10;
             sq=sq/10;

        }
        System.out.println("The automan Number");
    }



    static int Square(int n){
        return n*n;
    }

}

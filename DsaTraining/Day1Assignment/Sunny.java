import java.util.Scanner;

public class Sunny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean s=Square(n);
        if(s==true) {
            System.out.println("Sunny number");
        }else
            System.out.println("Not a sunny nuymber");
        }

static boolean Square(int n){
        for(int i=1;i<=n;i++){
            if((i*i)==n+1){
                return true;
            }

            }
        return false;


        }
}

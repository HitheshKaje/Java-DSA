import java.util.Scanner;

public class MinMax {
    static int Maximum(int n1,int n2,int n3){
        if(n1>n2 && n1>n3)
            return n1;
        else if (n2>n3 && n2>n1) {
            return n2;
        }
        else
            return n3;

        }

static int Minimum(int n1,int n2,int n3){
    if(n1<n2 && n1<n3)
        return n1;
    else if (n2<n3 && n2<n1) {
        return n2;
    }
    else
        return n3;

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int max = Maximum(n1, n2, n3);
        int min = Minimum(n1, n2, n3);

        System.out.println("The maximum Numbers is" + max);
        System.out.println("The minimum Numbers is" + min);


    }
    }

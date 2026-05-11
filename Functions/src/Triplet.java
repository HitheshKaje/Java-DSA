import java.util.Scanner;

public class Triplet {
     static int Triple(int n1,int n2,int n3){
         if (n1 * n1 + n2 * n2 == n3 * n3){
             return 1;
         }
         return -1;
     }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int res=Triple(n1,n2,n3);
        if(res==1)
            System.out.println("its a Triplet");
        else
            System.out.println("Not a trplet");

    }
}

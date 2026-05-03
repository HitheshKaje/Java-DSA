package src.com.hithesh;

public class Pattern4 {
    public static void main(String[] args){
        int i,j;
        int n=5;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                if(n==5){
                    System.out.print("*");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

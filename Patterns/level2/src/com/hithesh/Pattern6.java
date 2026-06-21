package src.com.hithesh;

public class Pattern6 {
    public static void main(String[] args){
        int i,j;
        int n=5;


        for(i=0;i<=n;i++){
            char ch='A';
            for(j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}

package src.com.hithesh;

public class Pattern7 {
    public static void main(String[] args){
        int i,j;
        int n=6;
        int k=1;
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}

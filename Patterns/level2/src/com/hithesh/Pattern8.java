package src.com.hithesh;

public class Pattern8 {
    public static void main(String[] args){
        int i,j;

        for(i=0;i<5;i++){
            int n=1;

            for(j=0;j<i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }
}

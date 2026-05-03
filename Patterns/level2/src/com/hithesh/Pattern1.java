package src.com.hithesh;

//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *
public class Pattern1 {
    public static void main(String[] args){
        int i,j;
        int n=5;
        for(i=0;i<n;i++){
            for(j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        } for(i=0;i<n-1;i++){
            for(j=1;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}

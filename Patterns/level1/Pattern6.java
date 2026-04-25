// 1
// 23
// 456
// 78910

public class Pattern6 {
    public static void main(String[] args) {
        int i,j;
        int n=4;
        int num=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println( );
        }
    }
    
}

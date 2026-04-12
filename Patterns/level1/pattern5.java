/*
A
BB
CCC
DDDD
*/
public class pattern5 {
    public static void main(String[] args) {
        char let ='A';
        int n=5;
        for (int i = 0; i <= n; i++) {
            for( int j=0;j<=i;j++){
                System.out.print(let+" ");
            }
            let++;
            System.out.println();
            
        }
    }
    
}

import java.util.Scanner;

public class Guess {

        static int guessNumber(int n) {
            int actual=-2;
            while(actual!=n){
                if(actual<n){
                    return -1;
                } else if (actual>n) {
                    return 1;
                }
                    return 0;




            }
            return -3;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int r=guessNumber(n);
        if(r==-1)
            System.out.println("Choose a low");
        if(r==1)
            System.out.println("Choose a high");
        if(r==0)
            System.out.println("Correct answer");
    }

}

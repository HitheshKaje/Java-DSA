package Day1Assignment;


import java.util.Scanner;
public class ProgramSwapFrstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int org=n;
        int last=n%10;
        n=n/10;
        int place=1;
        while(n>9){
            n=n/10;
            place*=10;

        }
        int frst=n;


        int middle = org % (place*10);
        middle = middle / 10;

        int result = last * (place*10) + middle * 10 + frst;

        System.out.println(result);

        }
}

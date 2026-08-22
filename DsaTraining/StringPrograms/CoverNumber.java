import java.util.Scanner;

public class CoverNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");

        String s1 = sc.next();
        int num=0;


        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
                num=num*10+(int)(c-'0');

            }
        System.out.println(num);
        }
}

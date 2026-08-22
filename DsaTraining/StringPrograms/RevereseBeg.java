import java.util.Scanner;

public class RevereseBeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String s = sc.next();

        String m="";
        int  index=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            m=c+m;

        }
        System.out.println(m);

    }
}

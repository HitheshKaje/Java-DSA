import java.util.Scanner;

public class Revrese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String s = sc.next();

        String m="";
       int  index=0;
        for(int i=s.length()-1;i>='\0';i--){
            m+=s.charAt(i);

        }
        System.out.println(m);

        }
}

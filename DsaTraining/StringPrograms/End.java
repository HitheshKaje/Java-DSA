import java.util.Scanner;

public class End {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String s = sc.next();
        String temp="";
        System.out.println("Enter the Character");
        char ch = sc.next().charAt(0);
        temp+=ch;
        for (int i=0;i<s.length();i++){
            temp+=s.charAt(i);
        }
        System.out.println(temp);
    }
}

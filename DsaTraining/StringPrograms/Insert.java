import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String s = sc.next();
        String temp="";
        System.out.println("Enter the Character");
        char ch = sc.next().charAt(0);
        for (int i=0;i<s.length();i++){
            temp+=s.charAt(i);
        }
        temp+=ch;
        System.out.println(temp);
    }
}
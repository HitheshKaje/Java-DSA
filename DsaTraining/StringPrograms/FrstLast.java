import java.util.Scanner;

public class FrstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String s = sc.next();
        String temp = "";
        for (int i = 1; i < s.length()-1; i++) {
            char c = s.charAt(i);
                temp += c;
        }
        System.out.println(temp);
    }

}

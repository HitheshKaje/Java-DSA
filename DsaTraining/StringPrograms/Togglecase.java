import java.util.Scanner;

public class Togglecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");

        String s1 = sc.next();
        String temp = "";

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                temp += (char) (c + 32);
            }
            if (c >= 'a' && c <= 'z') {
                temp += (char) (c - 32);
            }
        }
        System.out.println(temp);
    }
}

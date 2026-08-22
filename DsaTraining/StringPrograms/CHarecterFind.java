import java.util.Scanner;

public class CHarecterFind {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");

        String s = sc.next();
        System.out.println("Enter the Charecter");
        char c = sc.next().charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                System.out.println(s.charAt(i)+ " Charecter present in the string");
                return;
            }
        }
        System.out.println("Not present");
    }
}

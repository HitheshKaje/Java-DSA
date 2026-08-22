import java.util.Scanner;

public class Ovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");

        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    System.out.println(c);
                }
        }
    }
}

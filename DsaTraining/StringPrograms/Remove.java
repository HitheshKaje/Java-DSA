import java.util.Scanner;

public class Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence  ring");

        String s = sc.nextLine();
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                continue;
            }
            temp += c;
        }
        System.out.println(temp);
    }
}

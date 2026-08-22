import java.util.Scanner;

public class Removeoves {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String");

            String s = sc.next();
            String temp = "";
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    continue;
                }
                temp+=c;

            }
            System.out.println(temp);
        }

    }



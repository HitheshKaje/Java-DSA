import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Frst string");

        String s1 = sc.next();
        String res = "";
        System.out.println("Enter the second string");
        String s2 = sc.next();
        if (s1.length() != s2.length()) {
            System.out.println("Not a anagram");
            return;
        }

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            int count1 = 0;
            int count2 = 0;
            for (int j = 0; j < s1.length(); j++) {
                if (c == s1.charAt(j)) {
                    count1++;
                }
            }
            for (int k = 0; k < s2.length(); k++) {
                if (c == s2.charAt(k)) {
                    count2++;
                }
            }
            if (count1 != count2) {
                System.out.println("Not a anagram");
                return;
            }
        }
        System.out.println("panagram");
        }
        }


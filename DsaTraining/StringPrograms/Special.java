import java.util.Scanner;

public class Special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.next();
        int count=0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                count++;
            }
        }
        System.out.println(" special char count "+count);
    }
}

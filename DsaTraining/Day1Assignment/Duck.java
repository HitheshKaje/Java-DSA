
package Day1Assignment;
import java.util.Scanner;

public class Duck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean Isduck = false;
        while (n != 0) {
            int last = n % 10;
            if (last == 0) {
                Isduck = true;
            }
                n = n / 10;
            }
            if (Isduck) {
                System.out.println("The given Number is a Duck number");
            } else {
                System.out.println("Not a duck number");
            }

        }
    }

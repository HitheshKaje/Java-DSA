import java.util.Scanner;

public class REmoves {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String");

            String s = sc.nextLine();
            String temp = "";
            int start=0;
            int end=s.length()-1;
            while (start <= end && s.charAt(start) == ' ' && end >= start && s.charAt(end) == ' ') {
                start++;
                end--;
            }

            for (int i = start; i <=end; i++) {
                char c = s.charAt(i);
                temp+=c;

            }
            System.out.println(temp);
        }

    }


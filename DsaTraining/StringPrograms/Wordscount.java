import java.util.Scanner;

public class Wordscount {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the word");

            String s = sc.nextLine();
            int count=0;
            for (int i = 0; i < s.length(); i++) {
                char c=s.charAt(i);
                if(c ==' '){
                    count++;
                }

                }
            System.out.println(count+1);
            }
}

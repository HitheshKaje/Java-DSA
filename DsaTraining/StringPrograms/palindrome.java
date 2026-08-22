import java.util.Scanner;

public class palindrome {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String");

            String s = sc.next();
            String temp=s;
            String m="";
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                m=c+m;

            }
           if(temp.equals(m)){
               System.out.println("Palindrome");

        }else System.out.println("Not a palindrome");
    }

}

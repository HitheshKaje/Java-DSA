import java.util.Scanner;

public class Upper {

     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String");

            String s = sc.next();
            String name="";
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c>='a' && c <='z') {
                    name += (char) (c - 32);
                }
            }
            System.out.println(name);



        }
    }

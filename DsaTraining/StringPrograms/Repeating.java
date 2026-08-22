import java.util.Scanner;

public class Repeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String s1 = sc.next();
        String temp="";
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<s1.length();j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    System.out.println(s1.charAt(i));
                    return;
                }

                }
            }
        System.out.println("No repetaing charecter");
        }
}

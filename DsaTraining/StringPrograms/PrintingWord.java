import java.util.Scanner;

public class PrintingWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = "";
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != ' ') {
                temp += s1.charAt(i);

            } else{
                System.out.println(temp);
                temp="";
            }


        }
        System.out.print(temp);


    }
}

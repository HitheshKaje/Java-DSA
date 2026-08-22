import java.util.Scanner;

public class Hide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String s = sc.next();
        String temp="";
        if(s.length()<6){
            System.out.println("Invalid string");
            return;
        }
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(i>=0 && i<6){
                temp+='X';

            }else{
                temp+=a;
            }


        }
        System.out.println(temp);

        }
}

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isdigit = true;
        System.out.println("Enter the string");
        String s1 = sc.next();
        int num = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
//            num = num * 10 + (int) (c - '0');
//
//        }
//        while (num != 0) {
//            int last= num%10;
//            if(last>=0 || last<=9){
//                isdigit=true;
//                num=num/10;
//            }
//
//        }
//        if(isdigit==true)
//        System.out.println(" digits");
//        else
//        System.out.println(" not digits");
//
//    }
            if(!(c>='0' && c<='9')){
                System.out.println("Not only digits" );
                return;
            }
        }
        System.out.println("All digits");
    }
}

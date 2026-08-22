import java.util.Scanner;

public class CovertingStringtonum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
String temp="";
        int s1 = sc.nextInt();
       while (s1!=0){
           int last=s1%10;
           temp=(char)(last+'0')+temp;
           s1=s1/10;

        }
        System.out.println(temp);
    }
}

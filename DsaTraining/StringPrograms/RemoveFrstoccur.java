import java.util.Scanner;

public class RemoveFrstoccur {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String s1 = sc.next();
        System.out.println("Enter the Charecter");
        boolean removed =true;
        char ch = sc.next().charAt(0);
        String temp = "";
        for(int i=0;i<s1.length();i++){
            char c= s1.charAt(i);
                if(c==ch && removed==true){
                    temp=temp;
                    removed=false;
                }else {
                    temp += c;
                }
            }
        System.out.println(temp);
            }

        }

import java.util.Scanner;

public class Smallest {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String temp = "";
            String largest="";
            int maxlength=0;
            System.out.println("Enter the string");
            String s1 = sc.nextLine();
            for (int i = 0; i < s1.length(); i++) {

                if (s1.charAt(i) != ' ') {
                    temp += s1.charAt(i);

                } else{
                    if(temp.length()<largest.length()){
                        largest=temp;
                    }
                    temp="";
                }


            }
            if(temp.length()<largest.length()){
                largest=temp;
            }
            System.out.print(largest);


        }
    }

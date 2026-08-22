import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");

        String s = sc.nextLine();
        String res="";
        boolean isPanagram=true;
        for (char i = 'a'; i <= 'z'; i++) {
                int index=s.indexOf(i);
                if(index== -1){
                    System.out.println("not a panagram");
                    return;

                }
            }
        System.out.println("Panagram");
        }
    }

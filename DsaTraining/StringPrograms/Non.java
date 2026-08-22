import java.util.Scanner;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String s1 = sc.next();
        String temp="";

        for(int i=0;i<s1.length();i++){
            int count=0;
            for(int j=0;j<s1.length();j++){
                if(s1.charAt(i)==s1.charAt(j)){
                    count++;
                }


            }
            if(count==1){
                System.out.println(s1.charAt(i));
                return;

        }
        }
        System.out.println("All repating charecter");
    }
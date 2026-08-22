import java.util.Scanner;

public class Xloyem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Extrcat(n);

    }

    public static void Extrcat(int num){
        int nums=num;
        int min=num%10;
        num=num/10;
        int max=0;
        while(num>9){
             max+=num%10;
             num=num/10;

        }
        min+=num;
        if(min==max){
            System.out.println("Xloyen number");
        }else{
            System.out.println("Phlem numbers");
        }

    }

}
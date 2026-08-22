package Numberprog;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        int res=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base value");
        int n = sc.nextInt();
        System.out.println("Enter the exp");
        int exp = sc.nextInt();
        for (int i = 1; i <= exp; i++) {
            res=res*n;


        }
        System.out.println(res);

    }
}

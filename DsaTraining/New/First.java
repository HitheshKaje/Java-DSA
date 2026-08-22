import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Extracts(n);


    }


    public static void Extracts(int n){
        while(n>9){
             n=n/10;
        }
        System.out.println(n);
    }






}
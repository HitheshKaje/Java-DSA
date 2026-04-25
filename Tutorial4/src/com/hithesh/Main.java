package com.hithesh;

import java.util.Scanner;

public class Main {
    public static int add(int x,int y){
        return x+y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int res = add(n1, n2);
            System.out.println("The result is:" + res);
            if(n1==1){
                break;
            }

        }
    }
}

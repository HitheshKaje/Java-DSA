package com.hithesh;

import java.util.Scanner;

public class Rev {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int reverse=0;
        int num= sc.nextInt();
        while(num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;

        }
        System.out.print(reverse);
    }
}

package com;
//Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class Factor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }


        }
    }
}

package com;

import java.util.Scanner;

//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class Last {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int neg=0;
        int pos=0;
        int posodd=0;
        while(true){
            int n=input.nextInt();
            if(n==0){
                break;
            }
            if(n<0){

               neg+=n;
            }
            if(n>0 && n%2==0){
               pos+=n;

            }
            if(n>0 && n%2!=0){
                 posodd+=n;

            }
        }
        System.out.println(neg);
        System.out.println(pos);
        System.out.println(posodd);

    }
}

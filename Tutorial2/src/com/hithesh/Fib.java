package com.hithesh;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n1=0,n2=1,n3;
        System.out.print("Enter a Number:" );
        int n=input.nextInt();
        if(n<0){
            System.out.print("Enter a valid number");
        } else if (n==1) {
            System.out.print(n1+" ");
        } else if (n==2) {
            System.out.print(n2+" ");

        }else{
            System.out.print(n1+" ");
            System.out.print(n2+" ");
            for(int i=2;i<n;i++){
                n3=n1+n2;
                n1=n2;
                n2=n3;
                System.out.print(n3+" ");


            }

        }
    }
}

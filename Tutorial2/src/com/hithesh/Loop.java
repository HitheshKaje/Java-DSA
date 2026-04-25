package com.hithesh;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
//        for (int i=1;i<10;i++){
//            System.out.print(i+".Hello World"+"  ");
//        }
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while( i<n){
            System.out.print(i+".Hello World"+" ");
            i++;
        }
    }
}

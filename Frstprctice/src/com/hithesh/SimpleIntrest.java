package com.hithesh;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int p=sc.nextInt();
        int t= sc.nextInt();
        int r= sc.nextInt();

        int res=(p*t*r)/100;
        System.out.println(res);

    }
}


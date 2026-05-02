package com.hithesh;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class USd {
    public static void main(String[] args){
        double usd=91.55;
        Scanner sc=new Scanner(System.in);
        double rs= sc.nextDouble();
        double res=rs/usd;
        System.out.print(res);


    }


}

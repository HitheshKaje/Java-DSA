package com.hithesh;

import java.util.Scanner;

public class ArmStrong {
    static int armstr(int num){
        int sum=0;
        while(num!=0) {
            int rem = num % 10;
            int cube = rem * rem * rem;
            sum=sum+cube;
            num=num/10;
        }
        return sum;
        }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int res=armstr(num);
        System.out.println(res);
        if(num==res)
            System.out.println("The given Number is a ArmStrong Number");
        else
            System.out.println("Not a Armstrong number");



    }
}

package com;
//Subtract the Product and Sum of Digits of an Integer
import java.util.Scanner;

public class Sum {
    static int cal(int num){
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum+=rem;
            num=num/10;


        }
        return sum;
    }
    static int cal1(int num){
        int product=1;
        while(num!=0){
            int rem=num%10;
            product*=rem;
            num=num/10;


        }
        return product;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=cal(num);
        int res1=cal1(num);
       int fin=res1-res;
       System.out.println(fin);

    }
}

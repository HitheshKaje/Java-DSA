package com.hithesh;

public class Count {
    public static void main(String[] args){
       int n=455365555;
       int count=0;
       while (n>0){
           int digit=n%10;
           if(digit==5) {
               count++;
           }
           n=n/10;

           }
       System.out.print(count);
       }
    }


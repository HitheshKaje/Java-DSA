package com.hithesh;
//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String rev="";
        String temp=str;
        for(int i=str.length()-1;i>=0;i--) {
            rev = rev + str.charAt(i);
            System.out.println(rev);

        }
        System.out.println(rev);
        if (rev.equals(temp)){
            System.out.println("The given String is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
            }


    }
}

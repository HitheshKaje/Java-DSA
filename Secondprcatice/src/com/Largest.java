package com;
//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class Largest {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int largest=0;
            while (true) {

                int n = sc.nextInt();
                if(n==0){
                    break;
                }
                if(n>largest) {
                    largest = n;
                }


            }
            System.out.println("The largest is:"+largest);
        }
    }


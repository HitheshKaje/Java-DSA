package com.hithesh;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[3];
        for(int i=0;i< str.length;i++){
            str[i]=sc.next();
        }
        for(String ele:str){
            System.out.println(ele);

        }

    }
}

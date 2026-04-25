package com.hithesh;

import java.util.Scanner;

public class Swittches {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String fruit=sc.next();
        switch (fruit) {
            case "mango" -> System.out.print("This is a mango fruit");
            case "chiku" -> System.out.print(("This is a chikku fruit"));
            case "Banana" -> System.out.print(("This is a banana fruit"));
            case "orange" -> System.out.print(("This is a orange fruit"));
            case "apple" -> System.out.print(("This is a apple fruit"));
            default -> System.out.println("other fruits");
        }
    }
}

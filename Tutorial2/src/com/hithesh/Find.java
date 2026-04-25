package com.hithesh;

import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 3, 8, 5, 7, 5, 7, 8, 7, 9};
        int count = 0;
        for (int num : arr) {
            if (num == 7) {
                count++;
            }

        }
        System.out.print("The count is :"+count);
    }
}
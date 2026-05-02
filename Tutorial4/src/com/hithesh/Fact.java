package com.hithesh;

import com.sun.source.tree.BreakTree;

public class Fact {
    public static void main(String[] args) {
        int i = 1, n = 10;
        while (i <= n) {
            System.out.printf("The factorial of %d is %d\n", i, fact(i));
            i++;
        }
    }

    static int fact(int n) {
        int i = 1;
        int sum=1;
        while (i <= n) {
            sum*=i;
            i++;
        }
        return sum;

    }
}


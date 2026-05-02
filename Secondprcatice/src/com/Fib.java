package com;
//Fibonacci Series In Java Programs

public class Fib {
    static int fib(int n){
        int f1=0,f2=1,f3=0,i;
        if(n==f1)
            return f1;
        else if (n==f2)
            return f2;
        for(i=2;i<=n;i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;

        }
        return f3;

    }
    public static void main(String[] args){
        int n=7;
        int res=fib(n);
       System.out.println(res);

    }
}

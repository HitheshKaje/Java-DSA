package com.hithesh;

public class Array3 {
    public  static void main(String[] args){
        int[][]arr={
                {12,3,4},{3,4,5},{2,3,4,5,5}
        };

        System.out.println("The Two Dimensional Array is");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

    }
}

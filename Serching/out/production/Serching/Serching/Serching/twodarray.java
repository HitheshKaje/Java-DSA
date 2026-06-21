package Serching.Serching.Serching;

import java.util.Arrays;

public class twodarray {
    public static void main(String[] args){
        int[][] arr={{2,3,4},{4,5,3},{7,6,5,45},{54,32,45,42}};
    int target=2;
    int[]ans=search(arr,target);
    System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][]arr,int target){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }


            }
        }
        return new int[]{-1,-1};
    }
}

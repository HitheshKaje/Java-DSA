package Serching.Serching.Serching;

public class Find {
    public static void main(String[] args){
        int[] arr={2,3,7,6,5,8,9,1};
        System.out.println(linear(arr));

    }
   static int  linear(int[] arr){
        int min=0;
        for(int i=0;i< arr.length;i++){
            min=arr[i];
            if(arr[i]<min){
                min=arr[i];

            }

        }
       return  min;

   }
}


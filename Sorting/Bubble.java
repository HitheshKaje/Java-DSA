import java.util.Arrays;

public class Bubble {
    public static  void main(String[] args){
        int[] arr={0,12,4,35,67,43,23};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static  void bubble(int[]arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }
}

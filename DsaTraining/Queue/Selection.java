import java.lang.reflect.Array;
import java.util.Arrays;

public class Selection {
    public  static  void  main(String[] args){
        int []arr={65,25,12,22,11};
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                   min=arr[j];
                   minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

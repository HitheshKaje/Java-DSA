import java.util.Arrays;
public static  void main(String[] args){
        int[] arr={0,12,4,35,67,43,23};
    selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static  void selection(int[]arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxindex = getmax(arr, 0, last);
            swap(arr,maxindex,last);
        }
    }
    static void swap(int[]arr,int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
     static int getmax(int[] arr,int start,int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

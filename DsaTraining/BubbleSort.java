public class BubbleSort {
    public static  void main(String[] args){
        int [] arr={8,4,6,3,9,1,2};
        for (int i=0;i<arr.length;i++){
                if(arr[i]<arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}

public class binaryone {
    public static void main(String[] args){
        int []arr={4,6,7,8,32,34,56,78,89};
        int target=32;
        int ans=binarySerach(arr,target);
        System.out.println(ans);


    }

    static int binarySerach(int[] arr,int target){
        int start=0,end=arr.length-1;
        int mid;

        while(start<=end){
             mid=start+(end-start)/2;
             if(target<arr[mid]){
                 end=mid-1;
             }
             else if(target>arr[mid]){
                 start=mid+1;
             }else
             {
                 return mid;
             }
        }
            return -1;
    }

}


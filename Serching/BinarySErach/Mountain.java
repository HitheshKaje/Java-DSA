public class Mountain {
    public static void main(String[] args) {
    }
        int binary(int[] arr,int target){
            int peak=peakIndexinMountainArray(arr);
            int first=orderanostbs(arr,target,0,peak);
            if(first!=-1) {
                return first;
            }return  orderanostbs(arr,target,peak+1,arr.length-1);

    }
    public int peakIndexinMountainArray(int arr[]){
        int start=0;int end=arr.length-1;int mid;
        while(start<end){
             mid=start+(end-start)/2;               
                                                    
            if(arr[mid]>arr[mid+1]){ 
                end=mid;
            }else{
                start=mid+1;}
        }
        return start;
    }


               static int orderanostbs(int[] arr,int target,int start,int end){
                   boolean isASc=arr[start]<arr[end];
                   while(start<=end) {
                      int  mid = start + (end - start) / 2;

                       if (arr[mid] == target) {
                           return mid;
                       }
                       if (isASc) {
                           if (target < arr[mid]) {
                               end = mid - 1;
                           } else {
                               start = mid + 1;
                           }
                       } else {
                           if (target > arr[mid]) {
                               end = mid - 1;
                           } else {
                               start = mid + 1;
                           }
                       }
                   }

        return -1;
    }
}


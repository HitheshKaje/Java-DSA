public class Sealing {
    public static int sealing(int arr[],int target){
        int high=arr.length-1,low=0,mid;
        while(low<=high){
            mid=low+(high-low)/2;{
                if(target==arr[mid]) return mid;
                else{
                    if(target<=arr[mid]){
                        high=mid-1;
                    }else{
                        low=mid+1;
                    }
                }

            }

        } return arr[low];
    }
    public static void main(String[] args){
        int[]arr={2,3,5,9,14,16,18};
        int target;
        int res= sealing(arr,target=15);
        System.out.println(res);
    }

}

public class Floor {
    public static int seal(int arr[],int target){
        int high=arr.length-1,low=0,mid;
        if(target<arr[arr.length-1]){
            return -1;
        }
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

        } return arr[high];
    }
    public static void main(String[] args){
        int[]arr={2,3,5,9,14,16,18};
        int target;
        int res= seal(arr,target=1);
        System.out.println(res);
    }

}
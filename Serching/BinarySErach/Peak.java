public class Peak {
    public  static  void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        System.out.println("The peak Element Index is:"+binarySearch(arr));
    }
    static  int binarySearch(int[] arr){
        int high=arr.length-1,low=0,mid=0;
        while(low<high){
            mid=low+(high-low)/2;
                if(arr[mid]<arr[mid+1]) {
                    low = mid + 1;
                }
                else{
                    high=mid;
            }

        } return mid+1;
    }
    }

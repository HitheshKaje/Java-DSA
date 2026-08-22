public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 0;
        int mid;
        int target=5;
        int end = arr.length - 1;
        while (start <= end) {
            mid=start+(end-start)/2;
            if(target==arr[mid]){
                System.out.println(mid);
                return;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }

            System.out.println("Not found");
        }

    }
}

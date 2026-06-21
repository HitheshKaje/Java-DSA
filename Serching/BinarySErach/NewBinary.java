public class NewBinary {
    public static void main(String[] args) {
        int[] arr = {89, 78, 56, 43, 23, 17, 10, 2};
        int target = 17;
        int ans = binarySerach(arr, target);
        System.out.println(ans);


    }

    static int binarySerach(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int mid;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
public class Linear {
    public static void main(String[] args) {
        int[] nums={33,44,55,22,11,54,32};
        int target=32;
        int  res=linerSerach(nums,target);
        System.out.println(res);

    }

    static int linerSerach(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
        return -1;
    }
}

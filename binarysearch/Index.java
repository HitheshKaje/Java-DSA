public class Index {
    public int[] searchRange(int[] nums, int target) {
        int []ans={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    int search(int nums[],int target,boolean findStartIndex){
        int ans=-1;
        int low=0;
        int high=nums.length-1;
        while (low <= high) {
            int   mid = low + (high - low) / 2;
            if (target < nums[mid]) {
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex == true) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return  ans;

}
    public static void main(String[] args){
        int[]nums={5,7,7,8,8,10};
        int target=8;
        Index obj = new Index();
        int[] res = obj.searchRange(nums, target);

        System.out.println("Start Index = " + res[0]);
        System.out.println("End Index = " + res[1]);
    }
}



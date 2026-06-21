class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i;
        if(nums==null)
            return -1;

        for(i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }
            return -1;

        }
    }
    public  static  void main(String[] args){
        int[]nums={5,7,7,8,8,10};
        int target=8;
        int d=searchRange(nums,target);
    }
}


class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int news[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                news[i] = nums[i];
            }
            news[i] = nums[i];
        }
        return news;

    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 1, 2, 4};
        int[] sortedArray = solution.sortArrayByParity(nums);
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}

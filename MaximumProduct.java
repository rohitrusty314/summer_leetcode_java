class Solution {
    public int maximumProduct(int[] nums) {
    	Arrays.sort(nums);
    	int n = nums.length - 1;

    	int from_top = nums[n] * nums[n-1] * nums[n-2];
    	int from_bottom = nums[0] * nums[1] nums[2];

    	return Math.max(from_bottom, from_top);
    }
}
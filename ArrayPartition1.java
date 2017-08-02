public class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i i<nums.length;) {
        	sum += nums[i];
        	i += 2;
        }

        return sum;
    }
}
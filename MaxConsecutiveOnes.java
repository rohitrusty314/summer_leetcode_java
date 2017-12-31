public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int finalMax = 0;
        int currMax = 0;
        for(int i=0; i< nums.length; i++) {
        	if(nums[i] == 1) {
        		currMax++;
        	}
        	else {
        		currMax = 0;
        	}

        	finalMax = Math.max(finalMax, currMax);
        }

        return finalMax;
    }
}
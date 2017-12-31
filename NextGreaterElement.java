public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
    	int n = findNums.length;
    	if(n == 0) return findNums;
        HashSet<Integer> subSet = new HashSet<Integer>();

        for(int i=0; i<n; i++) {
        	subArray.add(findNums[i]);
        }

        HashMap<Integer, Integer> superSetWithNextGreater = 
        new  HashMap<Integer, Integer>();

        int m = nums.length;
        for(int i = 0; i<m; i++) {
        	int next = -1
        	if(subSet.contains(nums[i])) {
        		//find the next greater and
        		//insert it in superSetWithNextGreater
        		int j = i+1;
        		while(j<m && nums[j] < nums[i]) {j++;}

        		next = (j<m?nums[j]:next);
        		superSetWithNextGreater.add(nums[i], next);
        	} 
        }

        int[] res = new int[n];
        for(int i=0; i<n; i++) {
        	res[i] = superSetWithNextGreater.get(nums[i]);
        }

        return res;
    }
}
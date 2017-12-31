public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int thresh = Math.floor(nums.length/2);

        for(int num : nums) {
        	int occr = 1;
        	if(map.containsKey(num)) {
        		occr = map.get(num) + 1;
        		if(occr > thresh) return num;
        	}

        	map.put(num, occr);
        }

        return -1;
    }
}
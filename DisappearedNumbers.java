public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<Integer>();

        for(int i=0; i<n;) {
        	if(nums[i] == -1) i++;
        	else if(nums[nums[i]-1] == -1) i++;
            else if(nums[i] == i+1) {
                nums[i] = -1;
            }
        	else {
        		int temp = nums[nums[i]-1];
        		nums[nums[i]-1] = -1;
        		nums[i] = temp;
        	}
        }

        for(int i=0; i<n; i++){
        	if(nums[i] != -1) result.add(i+1);
        }

        return result;
    }
}
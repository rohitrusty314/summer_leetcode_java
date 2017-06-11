public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
    	
    	//if the array is empty
    	if(nums.length == 0) return nums;

    	//if the number of elements in the array
    	//can create the new array
    	int r_original = nums.length;
    	int c_original = nums[0].length;
        if(r*c != r_original*c_original) return nums;

        int[][] re_nums = new int[r][c];

        //reshape the array
        int k = 0, l = 0;
        for(int i=0;i<r_original;i++){
        	for(int j=0;j<c_original;j++){
        		
        		if(l>=c) {
        			l = 0;
        			k++;
        		}

        		re_nums[k][l] = nums[i][j];
        		l++;
        	}
        }

        return re_nums;
    }
}
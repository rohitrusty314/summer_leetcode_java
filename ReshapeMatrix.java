public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = (row<1?0:(nums[0].length));

        System.out.println("row: " + row + " col: " + col);

        if(row*col != r*c) return nums;

        int[][] res = new int[r][c];

        int i=0, j=0, ni=0, nj=0;
        while(i<row || j<col) {
        	if(j == col) {
        		j = 0;
        		i++;
        	}

        	if(nj == c){
        		nj = 0;
        		ni++;
        	}

        	res[ni][nj] = nums[i][j];
        	j++;
        	nj++;
        }

        return res;

    }
}
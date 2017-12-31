public class Solution {
    public int islandPerimeter(int[][] grid) {
        int peri = 0;
        int m = grid.length;
        int n = (m>0?grid[0].length:0);

        for(int i=0; i<m; i++) {
        	for(int j=0; j<n; j++) {
        		int cell_peri = 0;
        		if(grid[i][j] == 1) {
        			cell_peri = 4;
        			
        			//check the previous cell
        			if(j > 0) {
        				int prev = j-1;
        				if(grid[i][prev] == 1) cell_peri--;
        			}

        			//check for next cell
        			if(j < (n-1)) {
        				int next = j+1;
        				if(grid[i][next] == 1) cell_peri--;
        			}

        			//check for the cell above
        			if(i > 0) {
        				int up = i-1;
        				if(grid[up][j] == 1) cell_peri--;
        			}

        			//check for the cell below
        			if(i < (m-1)) {
        				int bottom = i+1;
        				if(grid[bottom][j] == 1) cell_peri--;
        			}
        		}

        		peri += cell_peri;

        	}
        }

        return peri;
    }
}
import java.util.*;

class PacificAtlantic {
	public static void main(String[] args) {
		PacificAtlantic pa = new PacificAtlantic();
		
		int[][] continent = {{1,2,2,3,5},
							 {3,2,3,4,4},
							 {2,4,5,3,1},
							 {6,7,1,4,5},
							 {5,1,1,2,4}};
		
		/*
		int[][] continent = {{1,2,3},
							 {8,9,4},
							 {7,6,5}};
							 */
		List<int[]> result = pa.pacificAtlantic(continent);
		for(int[] r : result) 
			System.out.println(r[0] + ", " + r[1]);
		
	}

	public List<int[]> pacificAtlantic(int[][] matrix) {
		int m = matrix.length;
		int n = (m > 0 ? matrix[0].length : 0);

		int[][] reachesPacific = new int[m][n];
		int[][] reachesAtlantic = new int[m][n];

		for(int i=0;i<m;i++) {
			explore(matrix, reachesPacific, i, 0, m, n);
			explore(matrix, reachesAtlantic, i, n-1, m, n);
		}

		for(int j=0;j<n;j++) {
			explore(matrix, reachesPacific, 0, j, m, n);
			explore(matrix, reachesAtlantic, m-1, j, m, n);
		}

		List<int[]> indices = new ArrayList<int[]>();
		for(int i=0;i<m;i++) 
			for(int j=0;j<n;j++) 
				if(reachesAtlantic[i][j] == 1 && reachesPacific[i][j] == 1) {
					int[] ij = new int[2];
					ij[0] = i;
					ij[1] = j;
					indices.add(ij);
				}

		return indices;
	}
    
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, -1, 0, 1};

    private void explore(int[][] matrix, int[][] reachesOcean, int i, int j, int m, int n) {
    	reachesOcean[i][j] = 1;
    	for(int d=0;d<4;d++) {
    		int di = i + dy[d];
    		int dj = j + dx[d];
    		if(di >= 0 && di < m && dj >= 0 && dj < n && reachesOcean[di][dj] == 0 && matrix[di][dj] >= matrix[i][j])
    			explore(matrix, reachesOcean, di, dj, m, n);
    	}
    } 
}
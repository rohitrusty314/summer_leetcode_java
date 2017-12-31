class Solution {
    public int[][] imageSmoother(int[][] M) {
        int n = M.length;
        int m = (n>0?M[0].length:0);

        int new_image = new int[n][m];

        for(int i=0;i<n;i++) {
        	int pixels_around = 0;
        	int pixel_sum = 0;
        	for(int j=0;j<m;j++) {
        		
        		if(j>0) {
        			pixel_sum += M[i][j-1];
        			pixels_around++;
        		}

        		if(i>0 && j>0) {
        			pixel_sum += M[i-1][j-1];
        			pixels_around++;
        		}

        		if(i>0) {
        			pixel_sum += M[i-1][j];
        			pixels_around++;
        		}

        		if(i>0 && j<m-1){
        			pixel_sum += M[i-1][j+1];
        			pixels_around++;
        		}
        		
        		if(j<n-1) {
        			pixel_sum += M[i][j+1];
        			pixels_around++;
        		}
        		
        		if(i<n-1 && j<m-1) {
        			pixel_sum += M[i+1][j+1];
        			pixels_around++;
        		}
        		
        		if(i<n-1) {
        			pixel_sum += M[i+1][j];
        			pixels_around++;
        		}
        		
        		if(i<n-1 && j>0) {
        			pixel_sum += M[i+1][j-1];
        			pixels_around++;
        		}

        		new_image[i][j] = (int) Math.floor(pixel_sum/pixels_around);
        		
        	}
        }

        return new_image;
    }
}
class Solution {
    public int numberOfBoomerangs(int[][] points) {
    	int n = points.length;
    	int boomerangs = 0;
        for(int i=0;i<n;i++) {
        	boomerangs += matchingDistances(points, i);
        }

        return boomerangs;
    }

    private int matchingDistances(int[][] points, int i) {
    	HashMap<Integer, Integer> dist = new HashMap<Integer, Integer>();
    	int equal_dist = 0;

    	for(int j=0;j<points.length;j++) {
    		if(j == i) continue;
    		int cur_dist = (int) (Math.pow((points[i][0] - points[j][0]),2) +
    							  Math.pow((points[i][1] - points[j][1]), 2));
    		if(dist.containsKey(cur_dist)) dist.put(cur_dist, dist.get(cur_dist) + 1);
    		else dist.put(cur_dist, 1);
    	}

    	for(int d:dist.keySet())
    		equal_dist += permutation(dist.get(d));
        
        return equal_dist;
    }

    private int permutation(int n) {
    	return n*(n-1);
    }
}
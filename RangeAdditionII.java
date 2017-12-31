public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int m_array = new int[m][n];
      
        for(int i=0;i<ops.length;i++){
        	int a = ops[i][0];
        	int b = ops[i][1];

        	for(int j=0;j<a;j++) {
        		for(int k=0;k<b;k++) {
        			m_array[j][k]++;
        		}
        	}
        }

        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for(int i=0; i<m; i++) {
        	for(int j=0; j<n; j++) {
        		if(count.containsKey(m_array[i][j])) 
        			count.put(m_array[i][j], count.get(m_array[i][j])++);
        		else 
        			count.put(m_array[i][j], 1);
        	}
        }

        int max = 0;
        for(int key : count.keySet()) {
        	if(count.get(key) > max) max = count.get(key);
        }

        return max;

    }
}
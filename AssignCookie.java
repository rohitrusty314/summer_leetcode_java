public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int child_count = 0;
        for(int greed : g) {
        	int i = cookieSizePossible(greed, s);
        	if(i != -1){
        		child_count++;
        		s[i] = -1;
        	}
        }

        return child_count;
    }

    private int cookieSizePossible(int c, int[] s) {
    	int cur = Integer.MAX_VALUE;
    	int cur_index = -1;
    	for(int i=0;i<s.length;i++) {
    		if(s[i] >= c && s[i] < cur) {
    			cur = s[i];
    			cur_index = i;
    		}
    	}

    	return cur_index;
    }
}
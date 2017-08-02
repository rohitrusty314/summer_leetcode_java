public class Solution {
    public int hammingDistance(int x, int y) {
    	int hammD = 0;
        while(x > 0 || y > 0) {
        	int bit1 = 0;
        	int bit2 = 0;
        	if(x > 0) bit1 = x%2;
        	if(y > 0) bit2 = y%2;
            
        	if(bit1 != bit2) hammD++;
        	x = x/2;
        	y = y/2;
        }

        return hammD;
    }
}
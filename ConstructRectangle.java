public class Solution {
    public int[] constructRectangle(int area) {
        int l = area;
        int w = 1;
        int min = l - w;
        int min_length = area/2;
        int[] res = new int[2];
        res[0] = l;
        res[1] = w;
        
        for(;l>=1;l--) {
            
            w = area/l;
        	if(area%l == 0 && l-w < min && l>=w) {
        		res[0] = l;
        		res[1] = w;
        		min = l - w;
        	}
        }

        return res;
    }
}
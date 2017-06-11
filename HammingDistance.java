public class Solution {
    public int hammingDistance(int x, int y) {
        int a = x ^ y;
        //System.out.println(a);
        int d = 0;
        while(a != 0){
        	if(a%2 == 1) d++;
        	a = a/2;
        }

        //System.out.println(d);
        return d;
    }
}
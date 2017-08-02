public class Solution {
    public int findComplement(int num) {
        String bin = "";
        while(num > 0) {
        	bin = Integer.toString(num%2).toString() + bin;
        	num = num/2;
        }

        int res = 0;
        int n = bin.length();
        
        for(int i=0; i<n; i++) {
                               
        	if(bin.charAt(n-i-1) == '0'){
        		res += Math.pow(2,i);
        	}
        }

        return res;
    }
}
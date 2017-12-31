public class Solution {
    public int titleToNumber(String s) {
       int n = s.length();
       if(n == 0) return 0;

       int num = 0;
       for(int i=n-1;i>=0;i--) {
       		int j = n - 1 - i;
       		num += Math.pow(26, j) * (s.charAt(i) - 'A' + 1);

       }

       return num;
    }
}
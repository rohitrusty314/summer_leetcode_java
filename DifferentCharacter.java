public class Solution {
    public char findTheDifference(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;
        int i;
        for(i=0;i<s.length();i++){
        	sum1 += s.charAt(i);
        	sum2 += t.charAt(i);
        }

        sum2 += t.charAt(i);
        return sum2 - sum1;
    }
}
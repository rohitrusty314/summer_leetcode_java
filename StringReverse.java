public class Solution {
    public String reverseString(String s) {
    	if(s.length() < 1) return s;

    	int i = 0;
    	int j = s.length()-1;
    	char[] rev = s.toCharArray();
    	while(i<j){
    		char temp = rev[i];
    		rev[i] = rev[j];
    		rev[j] = temp;
    		i++;
    		j--;
    	}
    	
    	return new String(rev);
    }
}
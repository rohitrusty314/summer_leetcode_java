public class Solution {
    public String reverseWords(String s) {
    	String res = "";
    	int len = s.length();

    	if(len == 0) return s;

    	for(int i=0, j=0; i<len; i++) {
    		String word = "";
    		if(s.charAt(i) == ' ') {
    			if(j==0) res = reverseWord(s.substring(j,i));
    			else res += " " + reverseWord(s.substring(j,i));

    			j = i + 1;
    		}

    		else if(i == len - 1) {
    			if(j==0) res = reverseWord(s.substring(j));
    			else res += " " + reverseWord(s.substring(j));
    		}
    	}
        
        return res;
    }

    private String reverseWord(String word) {
    	System.out.println(word);
    	String res = "";
    	for(int i=0;i<word.length();i++) {
    		res = String.valueOf(word.charAt(i)) + res;
    	}
    	System.out.println(res);
    	return res;
    }
}
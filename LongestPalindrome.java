class Solution {
    public int longestPalindrome(String s) {
        int[] lowers = new int[26];
        int[] uppers = new int[26];

        for(int i=0;i<s.length();i++) {
        	char ch = s.charAt(i);
        	if(isLowercase(ch)) lowers[ch - 'a']++;
        	else uppers[ch-'A']++;
        }

        int pal_length = 0;
        boolean single_found = false;
        for(int i=0;i<s.length();i++) {
        	char ch = s.charAt(i);
        	int count = 0;

        	if(isLowercase(ch)) {
                count = lowers[ch - 'a'];
                lowers[ch - 'a'] = 0;
            }
        	else {
                count = uppers[ch - 'A'];
                uppers[ch - 'A'] = 0;
            }
            
        	if(!single_found && count%2 == 1) {
        		pal_length += count;
        		single_found = true;
        	}
        	else if(single_found && count%2 == 1) pal_length += (count - 1);
        	else if(count%2 == 0) pal_length += count;
        }

        return pal_length;

    }

    private boolean isLowercase(char c) {
    	if(c >=97 && c <=122) return true;
    	return false;
    }
}
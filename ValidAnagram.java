class Solution {
    public boolean isAnagram(String s, String t) {
    	if(s.length() != t.length()) return false;

        int[] alphabets = new int[26];
        for(int i=0;i<s.length();i++) {
        	alphabets[s.charAt(i) - 'a']++;
        }

        for(int i=0;i<t.length();i++) {
        	if(alphabets[t.charAt(i) - 'a'] == 0)
        		return false;
        	else
        		alphabets[t.charAt(i) - 'a']--;
        }

        return true;
    }
}
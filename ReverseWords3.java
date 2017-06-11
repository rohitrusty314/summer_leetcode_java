public class Solution {
    public String reverseWords(String s) {
    	
    	if(s.length() == 0) return s;

        String[] words = s.split(" ");

        int n = words.length;
        String[] revWords = new String[n];
        int i = 0;
        for(String w:words){
        	revWords[i] = reverse(w);
        	i++;
        }

        i = 0;
        String rev = "";
        rev += revWords[i];

        for(i=1;i<n;i++)
        	rev = rev + " " + revWords[i];

        //System.out.println(rev);
        return rev;
    }

    public String reverse(String s){
    	String rev = "";
    	for(int i=0;i<s.length();i++)
    		rev = String.valueOf(s.charAt(i)) + rev;
    	//System.out.println(rev);
    	return rev;
    }
}
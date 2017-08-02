public class Solution {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();

        int i = 0;
        int j = s.length()-1;
        while(i<j) {
        	char temp = chars[i];
        	chars[i] = chars[j];
        	chars[j] = temp;
        	i++;
        	j--;
        }

        return String.valueOf(chars);
    }
}
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() == 0 && ransomNote.length() == 0) return true;
        if(magazine.length() == 0 || magazine.length() < ransomNote.length())
        	return false;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<magazine.length();i++) {
        	char ch = magazine.charAt(i);
        	if(map.containsKey(ch))
        		map.put(ch, map.get(ch) + 1);
        	else
        		map.put(ch, 1);
        }

        boolean flag = true;
        for(int i=0; i<ransomNote.length(); i++) {
        	char ch = ransomNote.charAt(i);
        	if(map.containsKey(ch)){
        		if(map.get(ch) == 0) {
        			flag = false;
        			break;
        		} 
        		else{
        			map.put(ch, map.get(ch) - 1);
                }
        	}
        	else {
        		flag = false;
        		break;
        	}
        }

        return flag;
    }
}